package co.conversely.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * A complete fact of an {@link Entry} to be translated from or to.
 */
@Entity
public class Phrase implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String text;

  protected Phrase() {}

  public Phrase(String text) {
    setText(text);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
