package com.chiksmedina.solar.boldduotone.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0828f, 10.8943f)
                curveTo(4.5217f, 8.5534f, 4.7412f, 7.3829f, 5.5743f, 6.6915f)
                curveTo(6.4075f, 6.0f, 7.5984f, 6.0f, 9.98f, 6.0f)
                horizontalLineTo(14.0209f)
                curveTo(16.4026f, 6.0f, 17.5934f, 6.0f, 18.4266f, 6.6915f)
                curveTo(19.2598f, 7.3829f, 19.4792f, 8.5534f, 19.9181f, 10.8943f)
                lineTo(20.6681f, 14.8943f)
                curveTo(21.2853f, 18.186f, 21.5939f, 19.8318f, 20.6942f, 20.9159f)
                curveTo(19.7945f, 22.0f, 18.12f, 22.0f, 14.7709f, 22.0f)
                horizontalLineTo(9.23f)
                curveTo(5.881f, 22.0f, 4.2064f, 22.0f, 3.3067f, 20.9159f)
                curveTo(2.407f, 19.8318f, 2.7156f, 18.186f, 3.3328f, 14.8943f)
                lineTo(4.0828f, 10.8943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 5.0f)
                curveTo(9.75f, 3.7574f, 10.7574f, 2.75f, 12.0f, 2.75f)
                curveTo(13.2426f, 2.75f, 14.25f, 3.7574f, 14.25f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(14.25f, 6.0f, 14.25f, 6.0f, 14.25f, 6.0f)
                curveTo(14.816f, 6.0002f, 15.3119f, 6.0017f, 15.7499f, 6.0149f)
                curveTo(15.75f, 6.0099f, 15.75f, 6.005f, 15.75f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(15.75f, 2.9289f, 14.0711f, 1.25f, 12.0f, 1.25f)
                curveTo(9.9289f, 1.25f, 8.25f, 2.9289f, 8.25f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(8.25f, 6.005f, 8.25f, 6.01f, 8.2501f, 6.0149f)
                curveTo(8.6881f, 6.0017f, 9.184f, 6.0002f, 9.75f, 6.0f)
                curveTo(9.75f, 6.0f, 9.75f, 6.0f, 9.75f, 6.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5303f, 10.4697f)
                curveTo(9.2374f, 10.1768f, 8.7626f, 10.1768f, 8.4697f, 10.4697f)
                curveTo(8.1768f, 10.7626f, 8.1768f, 11.2374f, 8.4697f, 11.5303f)
                lineTo(10.9394f, 14.0f)
                lineTo(8.4697f, 16.4697f)
                curveTo(8.1768f, 16.7626f, 8.1768f, 17.2374f, 8.4697f, 17.5303f)
                curveTo(8.7626f, 17.8232f, 9.2375f, 17.8232f, 9.5304f, 17.5303f)
                lineTo(12.0f, 15.0607f)
                lineTo(14.4696f, 17.5303f)
                curveTo(14.7625f, 17.8232f, 15.2374f, 17.8232f, 15.5303f, 17.5303f)
                curveTo(15.8232f, 17.2374f, 15.8232f, 16.7625f, 15.5303f, 16.4696f)
                lineTo(13.0607f, 14.0f)
                lineTo(15.5303f, 11.5304f)
                curveTo(15.8232f, 11.2375f, 15.8232f, 10.7626f, 15.5303f, 10.4697f)
                curveTo(15.2374f, 10.1768f, 14.7626f, 10.1768f, 14.4697f, 10.4697f)
                lineTo(12.0f, 12.9394f)
                lineTo(9.5303f, 10.4697f)
                close()
            }
        }
            .build()
        return _bagCross!!
    }

private var _bagCross: ImageVector? = null
