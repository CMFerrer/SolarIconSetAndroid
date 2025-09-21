package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.Traffic: ImageVector
    get() {
        if (_traffic != null) {
            return _traffic!!
        }
        _traffic = Builder(
            name = "Traffic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 2.3149f)
                curveTo(18.014f, 3.2194f, 20.7805f, 5.9859f, 21.685f, 9.4999f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 13.9778f, 21.4135f, 15.9112f, 20.3147f, 17.5557f)
                curveTo(19.2159f, 19.2002f, 17.6541f, 20.4819f, 15.8268f, 21.2388f)
                curveTo(13.9996f, 21.9957f, 11.9889f, 22.1937f, 10.0491f, 21.8079f)
                curveTo(8.1093f, 21.422f, 6.3275f, 20.4696f, 4.9289f, 19.0711f)
                curveTo(4.593f, 18.7351f, 4.2828f, 18.3771f, 4.0f, 18.0f)
                moveTo(2.1922f, 13.9509f)
                curveTo(1.8063f, 12.0111f, 2.0043f, 10.0004f, 2.7612f, 8.1732f)
                curveTo(3.5181f, 6.3459f, 4.7998f, 4.7841f, 6.4443f, 3.6853f)
                curveTo(8.0888f, 2.5865f, 10.0222f, 2.0f, 12.0f, 2.0f)
            }
        }
            .build()
        return _traffic!!
    }

private var _traffic: ImageVector? = null
