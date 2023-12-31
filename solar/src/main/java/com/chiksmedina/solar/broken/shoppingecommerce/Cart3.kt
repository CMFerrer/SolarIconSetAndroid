package com.chiksmedina.solar.broken.shoppingecommerce

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
import com.chiksmedina.solar.broken.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart3: ImageVector
    get() {
        if (_cart3 != null) {
            return _cart3!!
        }
        _cart3 = Builder(
            name = "Cart3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
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
                moveTo(8.0f, 13.0f)
                verticalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 13.0f)
                verticalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.0f)
                verticalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.864f, 16.4552f)
                curveTo(4.4097f, 18.6379f, 4.6825f, 19.7292f, 5.4963f, 20.3646f)
                curveTo(6.3101f, 21.0f, 7.435f, 21.0f, 9.6849f, 21.0f)
                horizontalLineTo(14.3155f)
                curveTo(16.5654f, 21.0f, 17.6903f, 21.0f, 18.5041f, 20.3646f)
                curveTo(19.3179f, 19.7292f, 19.5907f, 18.6379f, 20.1364f, 16.4552f)
                curveTo(20.9943f, 13.0234f, 21.4233f, 11.3075f, 20.5225f, 10.1538f)
                curveTo(19.6217f, 9.0f, 17.853f, 9.0f, 14.3155f, 9.0f)
                horizontalLineTo(9.6849f)
                curveTo(6.1474f, 9.0f, 4.3787f, 9.0f, 3.4779f, 10.1538f)
                curveTo(2.9491f, 10.831f, 2.8786f, 11.702f, 3.084f, 13.0f)
            }
        }
            .build()
        return _cart3!!
    }

private var _cart3: ImageVector? = null
