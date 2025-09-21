package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Forbidden: ImageVector
    get() {
        if (_forbidden != null) {
            return _forbidden!!
        }
        _forbidden = Builder(
            name = "Forbidden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.7571f, 17.3938f)
                lineTo(5.1815f, 18.8182f)
                lineTo(6.6062f, 20.2428f)
                curveTo(7.4733f, 21.1099f, 7.9069f, 21.5434f, 8.4582f, 21.7718f)
                curveTo(9.0095f, 22.0002f, 9.6226f, 22.0002f, 10.8489f, 22.0002f)
                horizontalLineTo(13.151f)
                curveTo(14.3773f, 22.0002f, 14.9904f, 22.0002f, 15.5417f, 21.7718f)
                curveTo(16.093f, 21.5434f, 16.5266f, 21.1099f, 17.3937f, 20.2428f)
                lineTo(20.2426f, 17.3939f)
                curveTo(21.1097f, 16.5268f, 21.5432f, 16.0933f, 21.7716f, 15.5419f)
                curveTo(21.9999f, 14.9906f, 22.0f, 14.3775f, 22.0f, 13.1513f)
                verticalLineTo(10.8491f)
                curveTo(22.0f, 9.6228f, 21.9999f, 9.0097f, 21.7716f, 8.4584f)
                curveTo(21.5432f, 7.9071f, 21.1097f, 7.4735f, 20.2426f, 6.6065f)
                lineTo(18.818f, 5.182f)
                lineTo(17.3935f, 3.7575f)
                curveTo(16.5264f, 2.8904f, 16.0928f, 2.4568f, 15.5415f, 2.2285f)
                curveTo(14.9902f, 2.0001f, 14.3771f, 2.0001f, 13.1508f, 2.0001f)
                horizontalLineTo(10.8487f)
                curveTo(9.6224f, 2.0001f, 9.0093f, 2.0001f, 8.458f, 2.2285f)
                curveTo(7.9067f, 2.4568f, 7.4731f, 2.8904f, 6.606f, 3.7575f)
                lineTo(3.7571f, 6.6064f)
                curveTo(2.89f, 7.4735f, 2.4565f, 7.907f, 2.2281f, 8.4583f)
                curveTo(1.9998f, 9.0096f, 1.9998f, 9.6228f, 1.9998f, 10.849f)
                verticalLineTo(13.1512f)
                curveTo(1.9998f, 14.3774f, 1.9998f, 14.9906f, 2.2281f, 15.5419f)
                curveTo(2.4565f, 16.0932f, 2.89f, 16.5267f, 3.7571f, 17.3938f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.8181f, 5.1821f)
                lineTo(5.1816f, 18.8184f)
            }
        }
            .build()
        return _forbidden!!
    }

private var _forbidden: ImageVector? = null
