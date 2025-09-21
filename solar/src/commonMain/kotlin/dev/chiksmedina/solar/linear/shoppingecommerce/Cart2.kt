package dev.chiksmedina.solar.linear.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart2: ImageVector
    get() {
        if (_cart2 != null) {
            return _cart2!!
        }
        _cart2 = Builder(
            name = "Cart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.8638f, 16.4552f)
                curveTo(3.0058f, 13.0234f, 2.5769f, 11.3075f, 3.4777f, 10.1538f)
                curveTo(4.3785f, 9.0f, 6.1472f, 9.0f, 9.6847f, 9.0f)
                horizontalLineTo(14.3153f)
                curveTo(17.8527f, 9.0f, 19.6214f, 9.0f, 20.5223f, 10.1538f)
                curveTo(21.4231f, 11.3075f, 20.9941f, 13.0234f, 20.1362f, 16.4552f)
                curveTo(19.5905f, 18.6379f, 19.3177f, 19.7292f, 18.5039f, 20.3646f)
                curveTo(17.6901f, 21.0f, 16.5652f, 21.0f, 14.3153f, 21.0f)
                horizontalLineTo(9.6847f)
                curveTo(7.4348f, 21.0f, 6.3099f, 21.0f, 5.4961f, 20.3646f)
                curveTo(4.6823f, 19.7292f, 4.4095f, 18.6379f, 3.8638f, 16.4552f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 9.5f)
                lineTo(18.7896f, 6.8946f)
                curveTo(18.5157f, 5.89f, 18.3787f, 5.3878f, 18.0978f, 5.0095f)
                curveTo(17.818f, 4.6327f, 17.4378f, 4.3423f, 17.0008f, 4.1715f)
                curveTo(16.5619f, 4.0f, 16.0413f, 4.0f, 15.0f, 4.0f)
                moveTo(4.5f, 9.5f)
                lineTo(5.2104f, 6.8946f)
                curveTo(5.4843f, 5.89f, 5.6213f, 5.3878f, 5.9022f, 5.0095f)
                curveTo(6.182f, 4.6327f, 6.5622f, 4.3423f, 6.9992f, 4.1715f)
                curveTo(7.4381f, 4.0f, 7.9587f, 4.0f, 9.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 4.0f)
                curveTo(9.0f, 3.4477f, 9.4477f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 3.0f, 15.0f, 3.4477f, 15.0f, 4.0f)
                curveTo(15.0f, 4.5523f, 14.5523f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 5.0f, 9.0f, 4.5523f, 9.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 18.0f)
                lineTo(12.0f, 9.0f)
                moveTo(19.5f, 18.0f)
                lineTo(12.5f, 9.5f)
                moveTo(4.5f, 10.0f)
                lineTo(12.0f, 21.0f)
                lineTo(19.5f, 10.0f)
            }
        }
            .build()
        return _cart2!!
    }

private var _cart2: ImageVector? = null
