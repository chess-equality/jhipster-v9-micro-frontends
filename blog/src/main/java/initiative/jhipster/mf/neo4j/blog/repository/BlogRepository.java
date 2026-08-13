package initiative.jhipster.mf.neo4j.blog.repository;

import initiative.jhipster.mf.neo4j.blog.domain.Blog;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j reactive repository for the Blog entity.
 */
@Repository
public interface BlogRepository extends ReactiveNeo4jRepository<Blog, String> {}
