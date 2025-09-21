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
                pathFillType = EvenOdd
            ) {
                moveTo(5.6746f, 7.5935f)
                curveTo(3.4317f, 8.3588f, 2.0f, 9.5227f, 2.0f, 10.8262f)
                curveTo(2.0f, 13.1313f, 6.4771f, 14.9999f, 12.0f, 14.9999f)
                curveTo(17.5228f, 14.9999f, 22.0f, 13.1313f, 22.0f, 10.8262f)
                curveTo(22.0f, 9.5227f, 20.5683f, 8.3588f, 18.3254f, 7.5935f)
                curveTo(18.2008f, 7.8837f, 17.9937f, 8.1775f, 17.6568f, 8.4118f)
                curveTo(16.8685f, 8.9601f, 15.3013f, 9.5f, 12.0f, 9.5f)
                curveTo(8.6987f, 9.5f, 7.1315f, 8.9601f, 6.3432f, 8.4118f)
                curveTo(6.0063f, 8.1775f, 5.7992f, 7.8837f, 5.6746f, 7.5935f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.0f, 11.5523f, 7.5523f, 12.0f, 7.0f, 12.0f)
                curveTo(6.4477f, 12.0f, 6.0f, 11.5523f, 6.0f, 11.0f)
                curveTo(6.0f, 10.4477f, 6.4477f, 10.0f, 7.0f, 10.0f)
                curveTo(7.5523f, 10.0f, 8.0f, 10.4477f, 8.0f, 11.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.5523f, 12.0f, 18.0f, 11.5523f, 18.0f, 11.0f)
                curveTo(18.0f, 10.4477f, 17.5523f, 10.0f, 17.0f, 10.0f)
                curveTo(16.4477f, 10.0f, 16.0f, 10.4477f, 16.0f, 11.0f)
                curveTo(16.0f, 11.5523f, 16.4477f, 12.0f, 17.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.055f, 7.0054f)
                curveTo(7.4032f, 4.7371f, 9.3631f, 3.0f, 11.7288f, 3.0f)
                horizontalLineTo(12.2712f)
                curveTo(14.6369f, 3.0f, 16.5968f, 4.7371f, 16.945f, 7.0054f)
                curveTo(16.9131f, 7.0743f, 16.866f, 7.1347f, 16.8003f, 7.1804f)
                curveTo(16.3862f, 7.4684f, 15.1898f, 8.0f, 12.0f, 8.0f)
                curveTo(8.8102f, 8.0f, 7.6138f, 7.4684f, 7.1997f, 7.1804f)
                curveTo(7.134f, 7.1347f, 7.0869f, 7.0743f, 7.055f, 7.0054f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 16.25f)
                curveTo(6.4142f, 16.25f, 6.75f, 16.5858f, 6.75f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(6.75f, 20.4142f, 6.4142f, 20.75f, 6.0f, 20.75f)
                curveTo(5.5858f, 20.75f, 5.25f, 20.4142f, 5.25f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(5.25f, 16.5858f, 5.5858f, 16.25f, 6.0f, 16.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.75f, 17.0f)
                curveTo(18.75f, 16.5858f, 18.4142f, 16.25f, 18.0f, 16.25f)
                curveTo(17.5858f, 16.25f, 17.25f, 16.5858f, 17.25f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(17.25f, 20.4142f, 17.5858f, 20.75f, 18.0f, 20.75f)
                curveTo(18.4142f, 20.75f, 18.75f, 20.4142f, 18.75f, 20.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
