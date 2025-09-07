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

val ShoppingEcommerceGroup.Bag5: ImageVector
    get() {
        if (_bag5 != null) {
            return _bag5!!
        }
        _bag5 = Builder(
            name = "Bag5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0353f, 16.9267f)
                curveTo(4.4971f, 19.2356f, 4.728f, 20.3901f, 5.5574f, 21.07f)
                curveTo(6.3869f, 21.75f, 7.5642f, 21.75f, 9.9188f, 21.75f)
                horizontalLineTo(14.0812f)
                curveTo(16.4358f, 21.75f, 17.6131f, 21.75f, 18.4425f, 21.07f)
                curveTo(19.272f, 20.3901f, 19.5029f, 19.2356f, 19.9646f, 16.9267f)
                lineTo(20.5646f, 13.9267f)
                curveTo(21.2287f, 10.6063f, 21.5608f, 8.9461f, 20.6606f, 7.848f)
                curveTo(19.7604f, 6.75f, 18.0673f, 6.75f, 14.6812f, 6.75f)
                horizontalLineTo(9.3188f)
                curveTo(5.9326f, 6.75f, 4.2395f, 6.75f, 3.3394f, 7.848f)
                curveTo(2.4392f, 8.9461f, 2.7712f, 10.6063f, 3.4353f, 13.9267f)
                lineTo(4.0353f, 16.9267f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 9.75f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 9.75f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 5.75f)
                curveTo(9.75f, 4.5074f, 10.7574f, 3.5f, 12.0f, 3.5f)
                curveTo(13.2426f, 3.5f, 14.25f, 4.5074f, 14.25f, 5.75f)
                verticalLineTo(6.75f)
                horizontalLineTo(14.6812f)
                curveTo(15.058f, 6.75f, 15.4139f, 6.75f, 15.75f, 6.7515f)
                lineTo(15.75f, 5.75f)
                curveTo(15.75f, 3.6789f, 14.0711f, 2.0f, 12.0f, 2.0f)
                curveTo(9.9289f, 2.0f, 8.25f, 3.6789f, 8.25f, 5.75f)
                lineTo(8.25f, 6.7515f)
                curveTo(8.5861f, 6.75f, 8.942f, 6.75f, 9.3188f, 6.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(5.75f)
                close()
            }
        }
            .build()
        return _bag5!!
    }

private var _bag5: ImageVector? = null
