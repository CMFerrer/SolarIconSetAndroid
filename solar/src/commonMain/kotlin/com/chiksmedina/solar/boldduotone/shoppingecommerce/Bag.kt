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

val ShoppingEcommerceGroup.Bag: ImageVector
    get() {
        if (_bag != null) {
            return _bag!!
        }
        _bag = Builder(
            name = "Bag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
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
        }
            .build()
        return _bag!!
    }

private var _bag: ImageVector? = null
