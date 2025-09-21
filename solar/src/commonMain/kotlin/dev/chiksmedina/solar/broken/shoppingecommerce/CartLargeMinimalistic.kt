package dev.chiksmedina.solar.broken.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.CartLargeMinimalistic: ImageVector
    get() {
        if (_cartLargeMinimalistic != null) {
            return _cartLargeMinimalistic!!
        }
        _cartLargeMinimalistic = Builder(
            name = "CartLargeMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 18.0f)
                curveTo(8.3284f, 18.0f, 9.0f, 18.6716f, 9.0f, 19.5f)
                curveTo(9.0f, 20.3284f, 8.3284f, 21.0f, 7.5f, 21.0f)
                curveTo(6.6716f, 21.0f, 6.0f, 20.3284f, 6.0f, 19.5f)
                curveTo(6.0f, 18.6716f, 6.6716f, 18.0f, 7.5f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 18.0001f)
                curveTo(17.3284f, 18.0001f, 18.0f, 18.6716f, 18.0f, 19.5001f)
                curveTo(18.0f, 20.3285f, 17.3284f, 21.0001f, 16.5f, 21.0001f)
                curveTo(15.6716f, 21.0001f, 15.0f, 20.3285f, 15.0f, 19.5001f)
                curveTo(15.0f, 18.6716f, 15.6716f, 18.0001f, 16.5f, 18.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 3.0f)
                lineTo(2.2612f, 3.0918f)
                curveTo(3.5628f, 3.5494f, 4.2136f, 3.7783f, 4.5858f, 4.323f)
                curveTo(4.9581f, 4.8677f, 4.9581f, 5.5913f, 4.9581f, 7.0384f)
                verticalLineTo(9.76f)
                curveTo(4.9581f, 12.7016f, 5.0213f, 13.6723f, 5.8877f, 14.5862f)
                curveTo(6.7541f, 15.5f, 8.1486f, 15.5f, 10.9375f, 15.5f)
                horizontalLineTo(12.0f)
                moveTo(16.2404f, 15.5f)
                curveTo(17.8014f, 15.5f, 18.5819f, 15.5f, 19.1336f, 15.0504f)
                curveTo(19.6853f, 14.6008f, 19.8429f, 13.8364f, 20.158f, 12.3075f)
                lineTo(20.6578f, 9.8827f)
                curveTo(21.0049f, 8.1437f, 21.1784f, 7.2742f, 20.7345f, 6.6971f)
                curveTo(20.2906f, 6.12f, 18.7738f, 6.12f, 17.0888f, 6.12f)
                horizontalLineTo(11.0235f)
                moveTo(4.9581f, 6.12f)
                horizontalLineTo(7.0f)
            }
        }
            .build()
        return _cartLargeMinimalistic!!
    }

private var _cartLargeMinimalistic: ImageVector? = null
