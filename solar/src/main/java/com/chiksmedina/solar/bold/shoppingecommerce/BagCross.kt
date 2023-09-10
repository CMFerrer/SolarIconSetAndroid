package com.chiksmedina.solar.bold.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.BagCross: ImageVector
    get() {
        if (_bagCross != null) {
            return _bagCross!!
        }
        _bagCross = Builder(
            name = "BagCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2501f, 6.0149f)
                curveTo(8.25f, 6.0099f, 8.25f, 6.005f, 8.25f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(8.25f, 2.9289f, 9.9289f, 1.25f, 12.0f, 1.25f)
                curveTo(14.0711f, 1.25f, 15.75f, 2.9289f, 15.75f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(15.75f, 6.005f, 15.75f, 6.0099f, 15.7499f, 6.0149f)
                curveTo(17.0371f, 6.0535f, 17.8248f, 6.1924f, 18.4261f, 6.6915f)
                curveTo(19.2593f, 7.3829f, 19.4787f, 8.5534f, 19.9177f, 10.8943f)
                lineTo(20.6677f, 14.8943f)
                curveTo(21.2849f, 18.186f, 21.5934f, 19.8318f, 20.6937f, 20.9159f)
                curveTo(19.794f, 22.0f, 18.1195f, 22.0f, 14.7704f, 22.0f)
                horizontalLineTo(9.2295f)
                curveTo(5.8805f, 22.0f, 4.2059f, 22.0f, 3.3062f, 20.9159f)
                curveTo(2.4065f, 19.8318f, 2.7151f, 18.186f, 3.3323f, 14.8943f)
                lineTo(4.0823f, 10.8943f)
                curveTo(4.5212f, 8.5534f, 4.7407f, 7.3829f, 5.5739f, 6.6915f)
                curveTo(6.1752f, 6.1924f, 6.9629f, 6.0535f, 8.2501f, 6.0149f)
                close()
                moveTo(9.75f, 5.0f)
                curveTo(9.75f, 3.7574f, 10.7574f, 2.75f, 12.0f, 2.75f)
                curveTo(13.2426f, 2.75f, 14.25f, 3.7574f, 14.25f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(14.25f, 6.0f, 14.25f, 6.0f, 14.25f, 6.0f)
                curveTo(14.1747f, 6.0f, 14.0982f, 6.0f, 14.0204f, 6.0f)
                horizontalLineTo(9.9795f)
                curveTo(9.9018f, 6.0f, 9.8253f, 6.0f, 9.75f, 6.0f)
                curveTo(9.75f, 6.0f, 9.75f, 6.0f, 9.75f, 6.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(8.4697f, 10.4697f)
                curveTo(8.7626f, 10.1768f, 9.2374f, 10.1768f, 9.5303f, 10.4697f)
                lineTo(12.0f, 12.9394f)
                lineTo(14.4697f, 10.4697f)
                curveTo(14.7625f, 10.1768f, 15.2374f, 10.1768f, 15.5303f, 10.4697f)
                curveTo(15.8232f, 10.7626f, 15.8232f, 11.2375f, 15.5303f, 11.5304f)
                lineTo(13.0607f, 14.0f)
                lineTo(15.5303f, 16.4696f)
                curveTo(15.8232f, 16.7625f, 15.8232f, 17.2374f, 15.5303f, 17.5303f)
                curveTo(15.2374f, 17.8232f, 14.7625f, 17.8232f, 14.4696f, 17.5303f)
                lineTo(12.0f, 15.0607f)
                lineTo(9.5303f, 17.5303f)
                curveTo(9.2374f, 17.8232f, 8.7626f, 17.8232f, 8.4697f, 17.5303f)
                curveTo(8.1768f, 17.2374f, 8.1768f, 16.7626f, 8.4697f, 16.4697f)
                lineTo(10.9393f, 14.0f)
                lineTo(8.4697f, 11.5303f)
                curveTo(8.1768f, 11.2374f, 8.1768f, 10.7626f, 8.4697f, 10.4697f)
                close()
            }
        }
            .build()
        return _bagCross!!
    }

private var _bagCross: ImageVector? = null
