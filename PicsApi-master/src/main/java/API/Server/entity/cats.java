package API.Server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="Catty")
public class cats {
    @Id
@GeneratedValue(generator = "increment")
@GenericGenerator(name="increment", strategy="increment")
private Long id;
    @Column(name="nick",nullable = false)
    private String nick;
    @Column(name="type",nullable = false)
    private String type;
    @Column(name="image",nullable = false)
    private String image;
    @Column(name="agelife", nullable = false)
    private int agelife;
    public cats()
     {}
    public Long getId()
    {
        return  id;
    }
    public void setId(Long id)
    {
        this.id=id;
    }
    public int getagelife()
    {
        return  agelife;
    }
    public void setagelife(int age)
    {
        this.agelife=agelife;
    }
    public String getnick()
    {
        return  nick;
    }
    public void setnick(String name)
    {
        this.nick=nick;
    }
    public String gettype()
    {
        return  type;
    }
    public void settype(String gender)
    {
        this.type=gender;
    }

}
