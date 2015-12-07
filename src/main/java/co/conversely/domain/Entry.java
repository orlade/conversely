package co.conversely.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * A single entry of a {@link Dictionary}, containing source and target {@link Phrase}s.
 */
@Entity
public class Entry implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne(optional = false)
  private Dictionary dictionary;

  @OneToOne(optional = false)
  private Phrase source;

  @OneToOne(optional = false)
  private Phrase target;

  protected Entry() {}

  public Entry(Phrase source, Phrase target) {
    setSource(source);
    setTarget(target);
  }

  public Phrase getSource() {
    return source;
  }

  public void setSource(Phrase source) {
    this.source = source;
  }

  public Phrase getTarget() {
    return target;
  }

  public void setTarget(Phrase target) {
    this.target = target;
  }

}
