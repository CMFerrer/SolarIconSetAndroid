package com.chiksmedina.solar.outline.astronomy

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
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(
            name = "Ufo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.3666f, 7.5989f)
                curveTo(6.8873f, 5.1152f, 9.0902f, 3.25f, 11.7288f, 3.25f)
                horizontalLineTo(12.2712f)
                curveTo(14.9098f, 3.25f, 17.1127f, 5.1152f, 17.6334f, 7.5989f)
                curveTo(18.9914f, 7.9668f, 20.1722f, 8.4732f, 21.0543f, 9.0978f)
                curveTo(22.0199f, 9.7815f, 22.75f, 10.7019f, 22.75f, 11.8262f)
                curveTo(22.75f, 12.6633f, 22.3404f, 13.3932f, 21.7409f, 13.9846f)
                curveTo(21.1442f, 14.5735f, 20.3191f, 15.0693f, 19.3599f, 15.4696f)
                curveTo(19.3498f, 15.4738f, 19.3396f, 15.4781f, 19.3294f, 15.4823f)
                lineTo(20.1708f, 17.1645f)
                curveTo(20.3561f, 17.5349f, 20.206f, 17.9855f, 19.8355f, 18.1708f)
                curveTo(19.465f, 18.3561f, 19.0145f, 18.206f, 18.8292f, 17.8355f)
                lineTo(17.9005f, 15.9787f)
                curveTo(16.401f, 16.4127f, 14.638f, 16.682f, 12.75f, 16.7386f)
                verticalLineTo(19.0f)
                curveTo(12.75f, 19.4142f, 12.4142f, 19.75f, 12.0f, 19.75f)
                curveTo(11.5858f, 19.75f, 11.25f, 19.4142f, 11.25f, 19.0f)
                verticalLineTo(16.7386f)
                curveTo(9.362f, 16.682f, 7.599f, 16.4127f, 6.0995f, 15.9787f)
                lineTo(5.1708f, 17.8355f)
                curveTo(4.9855f, 18.206f, 4.5349f, 18.3561f, 4.1645f, 18.1708f)
                curveTo(3.794f, 17.9855f, 3.6439f, 17.5349f, 3.8292f, 17.1645f)
                lineTo(4.6706f, 15.4823f)
                curveTo(4.6604f, 15.4781f, 4.6502f, 15.4738f, 4.6401f, 15.4696f)
                curveTo(3.6809f, 15.0693f, 2.8558f, 14.5735f, 2.2591f, 13.9846f)
                curveTo(1.6596f, 13.3932f, 1.25f, 12.6633f, 1.25f, 11.8262f)
                curveTo(1.25f, 10.7019f, 1.9801f, 9.7815f, 2.9457f, 9.0978f)
                curveTo(3.8278f, 8.4732f, 5.0086f, 7.9668f, 6.3666f, 7.5989f)
                close()
                moveTo(6.3176f, 9.1738f)
                curveTo(5.2752f, 9.4923f, 4.425f, 9.8883f, 3.8125f, 10.322f)
                curveTo(3.0254f, 10.8793f, 2.75f, 11.4057f, 2.75f, 11.8262f)
                curveTo(2.75f, 12.1417f, 2.9f, 12.5098f, 3.3126f, 12.9169f)
                curveTo(3.7279f, 13.3267f, 4.3673f, 13.7303f, 5.2178f, 14.0853f)
                curveTo(6.9156f, 14.7939f, 9.313f, 15.2499f, 12.0f, 15.2499f)
                curveTo(14.687f, 15.2499f, 17.0844f, 14.7939f, 18.7822f, 14.0853f)
                curveTo(19.6327f, 13.7303f, 20.2721f, 13.3267f, 20.6874f, 12.9169f)
                curveTo(21.1f, 12.5098f, 21.25f, 12.1417f, 21.25f, 11.8262f)
                curveTo(21.25f, 11.4057f, 20.9746f, 10.8793f, 20.1875f, 10.322f)
                curveTo(19.575f, 9.8883f, 18.7247f, 9.4923f, 17.6824f, 9.1738f)
                curveTo(17.6121f, 9.3951f, 17.4763f, 9.6237f, 17.2285f, 9.7961f)
                curveTo(16.6273f, 10.2142f, 15.2456f, 10.75f, 12.0f, 10.75f)
                curveTo(8.7544f, 10.75f, 7.3727f, 10.2142f, 6.7715f, 9.7961f)
                curveTo(6.5237f, 9.6237f, 6.3879f, 9.3951f, 6.3176f, 9.1738f)
                close()
                moveTo(7.751f, 8.6387f)
                curveTo(8.1381f, 8.8452f, 9.2542f, 9.25f, 12.0f, 9.25f)
                curveTo(14.7458f, 9.25f, 15.8619f, 8.8452f, 16.249f, 8.6387f)
                curveTo(16.2011f, 6.4829f, 14.4385f, 4.75f, 12.2712f, 4.75f)
                horizontalLineTo(11.7288f)
                curveTo(9.5615f, 4.75f, 7.7989f, 6.4829f, 7.751f, 8.6387f)
                close()
                moveTo(16.2497f, 8.7358f)
                curveTo(16.2497f, 8.7358f, 16.2497f, 8.7354f, 16.2498f, 8.7345f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 13.0f)
                curveTo(13.0f, 13.5523f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 13.5523f, 11.0f, 13.0f)
                curveTo(11.0f, 12.4477f, 11.4477f, 12.0f, 12.0f, 12.0f)
                curveTo(12.5523f, 12.0f, 13.0f, 12.4477f, 13.0f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 12.5523f, 7.5523f, 13.0f, 7.0f, 13.0f)
                curveTo(6.4477f, 13.0f, 6.0f, 12.5523f, 6.0f, 12.0f)
                curveTo(6.0f, 11.4477f, 6.4477f, 11.0f, 7.0f, 11.0f)
                curveTo(7.5523f, 11.0f, 8.0f, 11.4477f, 8.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 17.5523f, 13.0f, 17.0f, 13.0f)
                curveTo(16.4477f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4477f, 16.4477f, 11.0f, 17.0f, 11.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                close()
            }
        }
            .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
