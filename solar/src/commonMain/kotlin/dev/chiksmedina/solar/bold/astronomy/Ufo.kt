package dev.chiksmedina.solar.bold.astronomy

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
import dev.chiksmedina.solar.bold.AstronomyGroup

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
                moveTo(5.6746f, 8.5935f)
                curveTo(3.4317f, 9.3588f, 2.0f, 10.5227f, 2.0f, 11.8262f)
                curveTo(2.0f, 13.0342f, 3.2296f, 14.1223f, 5.1949f, 14.8844f)
                lineTo(3.857f, 17.1142f)
                curveTo(3.6439f, 17.4694f, 3.7591f, 17.9301f, 4.1142f, 18.1432f)
                curveTo(4.4694f, 18.3563f, 4.9301f, 18.2412f, 5.1432f, 17.886f)
                lineTo(6.6432f, 15.386f)
                curveTo(6.6492f, 15.376f, 6.655f, 15.3659f, 6.6605f, 15.3557f)
                curveTo(8.0069f, 15.7113f, 9.5708f, 15.9363f, 11.2501f, 15.9883f)
                verticalLineTo(19.0001f)
                curveTo(11.2501f, 19.4143f, 11.5859f, 19.7501f, 12.0001f, 19.7501f)
                curveTo(12.4143f, 19.7501f, 12.7501f, 19.4143f, 12.7501f, 19.0001f)
                verticalLineTo(15.9883f)
                curveTo(14.4294f, 15.9363f, 15.9933f, 15.7112f, 17.3397f, 15.3557f)
                curveTo(17.3452f, 15.3659f, 17.351f, 15.376f, 17.357f, 15.386f)
                lineTo(18.857f, 17.886f)
                curveTo(19.0701f, 18.2412f, 19.5308f, 18.3563f, 19.886f, 18.1432f)
                curveTo(20.2412f, 17.9301f, 20.3563f, 17.4694f, 20.1432f, 17.1142f)
                lineTo(18.8053f, 14.8844f)
                curveTo(20.7705f, 14.1222f, 22.0f, 13.0342f, 22.0f, 11.8262f)
                curveTo(22.0f, 10.5227f, 20.5683f, 9.3588f, 18.3254f, 8.5935f)
                curveTo(18.2008f, 8.8837f, 17.9937f, 9.1775f, 17.6568f, 9.4118f)
                curveTo(16.8685f, 9.9601f, 15.3013f, 10.5f, 12.0f, 10.5f)
                curveTo(8.6987f, 10.5f, 7.1315f, 9.9601f, 6.3432f, 9.4118f)
                curveTo(6.0063f, 9.1775f, 5.7992f, 8.8837f, 5.6746f, 8.5935f)
                close()
                moveTo(13.0f, 13.0f)
                curveTo(13.0f, 13.5523f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 13.5523f, 11.0f, 13.0f)
                curveTo(11.0f, 12.4477f, 11.4477f, 12.0f, 12.0f, 12.0f)
                curveTo(12.5523f, 12.0f, 13.0f, 12.4477f, 13.0f, 13.0f)
                close()
                moveTo(7.0f, 13.0f)
                curveTo(7.5523f, 13.0f, 8.0f, 12.5523f, 8.0f, 12.0f)
                curveTo(8.0f, 11.4477f, 7.5523f, 11.0f, 7.0f, 11.0f)
                curveTo(6.4477f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f)
                curveTo(6.0f, 12.5523f, 6.4477f, 13.0f, 7.0f, 13.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 17.5523f, 13.0f, 17.0f, 13.0f)
                curveTo(16.4477f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4477f, 16.4477f, 11.0f, 17.0f, 11.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.055f, 8.0054f)
                curveTo(7.4032f, 5.7371f, 9.3631f, 4.0f, 11.7288f, 4.0f)
                horizontalLineTo(12.2712f)
                curveTo(14.6369f, 4.0f, 16.5968f, 5.7371f, 16.945f, 8.0054f)
                curveTo(16.9131f, 8.0743f, 16.866f, 8.1347f, 16.8003f, 8.1804f)
                curveTo(16.3862f, 8.4684f, 15.1898f, 9.0f, 12.0f, 9.0f)
                curveTo(8.8102f, 9.0f, 7.6138f, 8.4684f, 7.1997f, 8.1804f)
                curveTo(7.134f, 8.1347f, 7.0869f, 8.0743f, 7.055f, 8.0054f)
                close()
            }
        }
            .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
