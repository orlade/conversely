package co.conversely.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NaturalId;

/**
 * A complete fact of an {@link Entry} to be translated from or to.
 */
public class Phrase implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;

  @OneToOne(optional = false)
  @NaturalId
  private Entry entry;

  @Column(nullable = false)
  private String text;

  protected Phrase() {}

  public Phrase(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
