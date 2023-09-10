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

val ShoppingEcommerceGroup.BagCheck: ImageVector
    get() {
        if (_bagCheck != null) {
            return _bagCheck!!
        }
        _bagCheck = Builder(
            name = "BagCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.5857f, 11.9685f)
                curveTo(15.8444f, 11.6451f, 15.792f, 11.1731f, 15.4685f, 10.9144f)
                curveTo(15.1451f, 10.6556f, 14.6731f, 10.7081f, 14.4143f, 11.0315f)
                lineTo(10.9375f, 15.3769f)
                lineTo(9.5303f, 13.9697f)
                curveTo(9.2374f, 13.6768f, 8.7626f, 13.6768f, 8.4697f, 13.9697f)
                curveTo(8.1768f, 14.2626f, 8.1768f, 14.7375f, 8.4697f, 15.0304f)
                lineTo(10.4697f, 17.0304f)
                curveTo(10.6205f, 17.1812f, 10.8285f, 17.2607f, 11.0415f, 17.2489f)
                curveTo(11.2545f, 17.2371f, 11.4524f, 17.1351f, 11.5857f, 16.9685f)
                lineTo(15.5857f, 11.9685f)
                close()
            }
        }
            .build()
        return _bagCheck!!
    }

private var _bagCheck: ImageVector? = null
