package com.chiksmedina.solar.broken.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.ShopMinimalistic: ImageVector
    get() {
        if (_shopMinimalistic != null) {
            return _shopMinimalistic!!
        }
        _shopMinimalistic = Builder(
            name = "ShopMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 22.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 22.0f)
                horizontalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 22.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.9999f, 2.0f)
                horizontalLineTo(7.4721f)
                curveTo(6.2693f, 2.0f, 5.6679f, 2.0f, 5.1846f, 2.2987f)
                curveTo(4.7013f, 2.5974f, 4.4323f, 3.1353f, 3.8944f, 4.2111f)
                lineTo(2.4908f, 7.7593f)
                curveTo(2.1665f, 8.5791f, 1.8828f, 9.5452f, 2.4287f, 10.2375f)
                curveTo(2.7949f, 10.7019f, 3.3626f, 11.0f, 3.9999f, 11.0f)
                curveTo(5.1045f, 11.0f, 5.9999f, 10.1046f, 5.9999f, 9.0f)
                curveTo(5.9999f, 10.1046f, 6.8953f, 11.0f, 7.9999f, 11.0f)
                curveTo(9.1045f, 11.0f, 9.9999f, 10.1046f, 9.9999f, 9.0f)
                curveTo(9.9999f, 10.1046f, 10.8953f, 11.0f, 11.9999f, 11.0f)
                curveTo(13.1045f, 11.0f, 13.9999f, 10.1046f, 13.9999f, 9.0f)
                curveTo(13.9999f, 10.1046f, 14.8953f, 11.0f, 15.9999f, 11.0f)
                curveTo(17.1045f, 11.0f, 17.9999f, 10.1046f, 17.9999f, 9.0f)
                curveTo(17.9999f, 10.1046f, 18.8953f, 11.0f, 19.9999f, 11.0f)
                curveTo(20.6373f, 11.0f, 21.205f, 10.7019f, 21.5712f, 10.2375f)
                curveTo(22.1171f, 9.5452f, 21.8334f, 8.5791f, 21.5091f, 7.7593f)
                lineTo(20.1055f, 4.2111f)
                curveTo(19.5676f, 3.1353f, 19.2986f, 2.5974f, 18.8153f, 2.2987f)
                curveTo(18.332f, 2.0f, 17.7306f, 2.0f, 16.5278f, 2.0f)
                horizontalLineTo(16.0f)
            }
        }
            .build()
        return _shopMinimalistic!!
    }

private var _shopMinimalistic: ImageVector? = null
