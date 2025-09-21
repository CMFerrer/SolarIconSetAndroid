package dev.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(
            name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 12.2315f)
                lineTo(19.9546f, 11.2769f)
                curveTo(21.3182f, 9.9133f, 22.0f, 9.2315f, 22.0f, 8.3843f)
                curveTo(22.0f, 7.537f, 21.3182f, 6.8552f, 19.9546f, 5.4917f)
                lineTo(18.5083f, 4.0454f)
                curveTo(17.1448f, 2.6818f, 16.463f, 2.0f, 15.6157f, 2.0f)
                curveTo(14.7685f, 2.0f, 14.0867f, 2.6818f, 12.7231f, 4.0454f)
                lineTo(4.0454f, 12.7231f)
                curveTo(2.6818f, 14.0867f, 2.0f, 14.7685f, 2.0f, 15.6157f)
                curveTo(2.0f, 16.463f, 2.6818f, 17.1448f, 4.0454f, 18.5083f)
                lineTo(5.4917f, 19.9546f)
                curveTo(6.8552f, 21.3182f, 7.537f, 22.0f, 8.3843f, 22.0f)
                curveTo(9.2315f, 22.0f, 9.9133f, 21.3182f, 11.2769f, 19.9546f)
                lineTo(16.2315f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.4644f, 8.4644f)
                lineTo(9.8786f, 9.8786f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.707f, 4.2217f)
                lineTo(14.1212f, 5.6359f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.2219f, 12.707f)
                lineTo(5.6361f, 14.1212f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3433f, 10.5859f)
                lineTo(8.4646f, 12.7073f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5857f, 6.3433f)
                lineTo(12.707f, 8.4646f)
            }
        }
            .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
