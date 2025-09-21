package dev.chiksmedina.solar.outline.astronomy

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
import dev.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Ufo2: ImageVector
    get() {
        if (_ufo2 != null) {
            return _ufo2!!
        }
        _ufo2 = Builder(
            name = "Ufo2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
                curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                curveTo(11.0f, 11.4477f, 11.4477f, 11.0f, 12.0f, 11.0f)
                curveTo(12.5523f, 11.0f, 13.0f, 11.4477f, 13.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 11.0f)
                curveTo(8.0f, 11.5523f, 7.5523f, 12.0f, 7.0f, 12.0f)
                curveTo(6.4477f, 12.0f, 6.0f, 11.5523f, 6.0f, 11.0f)
                curveTo(6.0f, 10.4477f, 6.4477f, 10.0f, 7.0f, 10.0f)
                curveTo(7.5523f, 10.0f, 8.0f, 10.4477f, 8.0f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 11.0f)
                curveTo(18.0f, 11.5523f, 17.5523f, 12.0f, 17.0f, 12.0f)
                curveTo(16.4477f, 12.0f, 16.0f, 11.5523f, 16.0f, 11.0f)
                curveTo(16.0f, 10.4477f, 16.4477f, 10.0f, 17.0f, 10.0f)
                curveTo(17.5523f, 10.0f, 18.0f, 10.4477f, 18.0f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.3666f, 6.5989f)
                curveTo(6.8873f, 4.1152f, 9.0902f, 2.25f, 11.7288f, 2.25f)
                horizontalLineTo(12.2712f)
                curveTo(14.9098f, 2.25f, 17.1127f, 4.1152f, 17.6334f, 6.5989f)
                curveTo(18.9914f, 6.9668f, 20.1722f, 7.4732f, 21.0543f, 8.0978f)
                curveTo(22.0199f, 8.7815f, 22.75f, 9.7019f, 22.75f, 10.8262f)
                curveTo(22.75f, 11.6633f, 22.3404f, 12.3932f, 21.7409f, 12.9846f)
                curveTo(21.1442f, 13.5735f, 20.3191f, 14.0693f, 19.3599f, 14.4696f)
                curveTo(17.4384f, 15.2715f, 14.8358f, 15.7499f, 12.0f, 15.7499f)
                curveTo(9.1642f, 15.7499f, 6.5616f, 15.2715f, 4.6401f, 14.4696f)
                curveTo(3.6809f, 14.0693f, 2.8558f, 13.5735f, 2.2591f, 12.9846f)
                curveTo(1.6596f, 12.3932f, 1.25f, 11.6633f, 1.25f, 10.8262f)
                curveTo(1.25f, 9.7019f, 1.9801f, 8.7815f, 2.9457f, 8.0978f)
                curveTo(3.8278f, 7.4732f, 5.0086f, 6.9668f, 6.3666f, 6.5989f)
                close()
                moveTo(6.3176f, 8.1738f)
                curveTo(5.2752f, 8.4923f, 4.425f, 8.8883f, 3.8125f, 9.322f)
                curveTo(3.0254f, 9.8793f, 2.75f, 10.4057f, 2.75f, 10.8262f)
                curveTo(2.75f, 11.1417f, 2.9f, 11.5098f, 3.3126f, 11.9169f)
                curveTo(3.7279f, 12.3267f, 4.3673f, 12.7303f, 5.2178f, 13.0853f)
                curveTo(6.9156f, 13.7939f, 9.313f, 14.2499f, 12.0f, 14.2499f)
                curveTo(14.687f, 14.2499f, 17.0844f, 13.7939f, 18.7822f, 13.0853f)
                curveTo(19.6327f, 12.7303f, 20.2721f, 12.3267f, 20.6874f, 11.9169f)
                curveTo(21.1f, 11.5098f, 21.25f, 11.1417f, 21.25f, 10.8262f)
                curveTo(21.25f, 10.4057f, 20.9746f, 9.8793f, 20.1875f, 9.322f)
                curveTo(19.575f, 8.8883f, 18.7247f, 8.4923f, 17.6824f, 8.1738f)
                curveTo(17.6121f, 8.3951f, 17.4763f, 8.6237f, 17.2285f, 8.7961f)
                curveTo(16.6273f, 9.2142f, 15.2456f, 9.75f, 12.0f, 9.75f)
                curveTo(8.7544f, 9.75f, 7.3727f, 9.2142f, 6.7715f, 8.7961f)
                curveTo(6.5237f, 8.6237f, 6.3879f, 8.3951f, 6.3176f, 8.1738f)
                close()
                moveTo(7.751f, 7.6387f)
                curveTo(8.1381f, 7.8452f, 9.2542f, 8.25f, 12.0f, 8.25f)
                curveTo(14.7458f, 8.25f, 15.8619f, 7.8452f, 16.249f, 7.6387f)
                curveTo(16.2011f, 5.4829f, 14.4385f, 3.75f, 12.2712f, 3.75f)
                horizontalLineTo(11.7288f)
                curveTo(9.5615f, 3.75f, 7.7989f, 5.4829f, 7.751f, 7.6387f)
                close()
                moveTo(16.2497f, 7.7358f)
                curveTo(16.2497f, 7.7358f, 16.2497f, 7.7354f, 16.2498f, 7.7345f)
                close()
                moveTo(6.0f, 16.25f)
                curveTo(6.4142f, 16.25f, 6.75f, 16.5858f, 6.75f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(6.75f, 20.4142f, 6.4142f, 20.75f, 6.0f, 20.75f)
                curveTo(5.5858f, 20.75f, 5.25f, 20.4142f, 5.25f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(5.25f, 16.5858f, 5.5858f, 16.25f, 6.0f, 16.25f)
                close()
                moveTo(18.0f, 16.25f)
                curveTo(18.4142f, 16.25f, 18.75f, 16.5858f, 18.75f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(18.75f, 20.4142f, 18.4142f, 20.75f, 18.0f, 20.75f)
                curveTo(17.5858f, 20.75f, 17.25f, 20.4142f, 17.25f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(17.25f, 16.5858f, 17.5858f, 16.25f, 18.0f, 16.25f)
                close()
                moveTo(12.0f, 17.25f)
                curveTo(12.4142f, 17.25f, 12.75f, 17.5858f, 12.75f, 18.0f)
                verticalLineTo(21.0f)
                curveTo(12.75f, 21.4142f, 12.4142f, 21.75f, 12.0f, 21.75f)
                curveTo(11.5858f, 21.75f, 11.25f, 21.4142f, 11.25f, 21.0f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 17.5858f, 11.5858f, 17.25f, 12.0f, 17.25f)
                close()
            }
        }
            .build()
        return _ufo2!!
    }

private var _ufo2: ImageVector? = null
