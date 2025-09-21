package dev.chiksmedina.solar.bold.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SearchGroup

val SearchGroup.RoundedMagnifer: ImageVector
    get() {
        if (_roundedMagnifer != null) {
            return _roundedMagnifer!!
        }
        _roundedMagnifer = Builder(
            name = "RoundedMagnifer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.8194f, 19.7006f)
                curveTo(17.7302f, 18.6064f, 18.6357f, 17.6929f, 19.7205f, 17.783f)
                curveTo(19.9086f, 17.7986f, 20.1337f, 17.8671f, 20.363f, 17.9368f)
                curveTo(20.3851f, 17.9435f, 20.4073f, 17.9502f, 20.4294f, 17.9569f)
                curveTo(20.4494f, 17.9629f, 20.4694f, 17.9689f, 20.4894f, 17.975f)
                curveTo(20.7001f, 18.0383f, 20.9097f, 18.1013f, 21.0692f, 18.1874f)
                curveTo(21.9844f, 18.6818f, 22.2799f, 19.8631f, 21.7067f, 20.7363f)
                curveTo(21.6068f, 20.8884f, 21.4519f, 21.0441f, 21.2962f, 21.2007f)
                curveTo(21.2814f, 21.2156f, 21.2666f, 21.2305f, 21.2519f, 21.2454f)
                curveTo(21.2371f, 21.2602f, 21.2224f, 21.2752f, 21.2076f, 21.2901f)
                curveTo(21.0524f, 21.4471f, 20.898f, 21.6034f, 20.7472f, 21.7041f)
                curveTo(19.8816f, 22.2823f, 18.7105f, 21.9843f, 18.2204f, 21.0611f)
                curveTo(18.135f, 20.9002f, 18.0726f, 20.6888f, 18.0097f, 20.4762f)
                curveTo(18.0038f, 20.4561f, 17.9978f, 20.4359f, 17.9918f, 20.4157f)
                curveTo(17.9852f, 20.3934f, 17.9785f, 20.3711f, 17.9719f, 20.3488f)
                curveTo(17.9028f, 20.1175f, 17.8349f, 19.8903f, 17.8194f, 19.7006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.1278f, 11.1429f)
                curveTo(20.1278f, 16.1924f, 16.0697f, 20.2858f, 11.0639f, 20.2858f)
                curveTo(6.058f, 20.2858f, 2.0f, 16.1924f, 2.0f, 11.1429f)
                curveTo(2.0f, 6.0934f, 6.058f, 2.0f, 11.0639f, 2.0f)
                curveTo(16.0697f, 2.0f, 20.1278f, 6.0934f, 20.1278f, 11.1429f)
                close()
            }
        }
            .build()
        return _roundedMagnifer!!
    }

private var _roundedMagnifer: ImageVector? = null
