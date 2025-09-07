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

val ShoppingEcommerceGroup.Bag4: ImageVector
    get() {
        if (_bag4 != null) {
            return _bag4!!
        }
        _bag4 = Builder(
            name = "Bag4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.2501f, 7.0135f)
                curveTo(8.25f, 7.009f, 8.25f, 7.0045f, 8.25f, 7.0f)
                verticalLineTo(6.0f)
                curveTo(8.25f, 3.9289f, 9.9289f, 2.25f, 12.0f, 2.25f)
                curveTo(14.0711f, 2.25f, 15.75f, 3.9289f, 15.75f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(15.75f, 7.0045f, 15.75f, 7.009f, 15.7499f, 7.0135f)
                curveTo(17.0472f, 7.0497f, 17.8375f, 7.1839f, 18.4425f, 7.68f)
                curveTo(19.272f, 8.36f, 19.5029f, 9.5144f, 19.9646f, 11.8233f)
                lineTo(20.5646f, 14.8233f)
                curveTo(21.2287f, 18.1437f, 21.5608f, 19.8039f, 20.6606f, 20.902f)
                curveTo(19.7604f, 22.0f, 18.0673f, 22.0f, 14.6812f, 22.0f)
                horizontalLineTo(9.3188f)
                curveTo(5.9326f, 22.0f, 4.2395f, 22.0f, 3.3394f, 20.902f)
                curveTo(2.4392f, 19.8039f, 2.7712f, 18.1437f, 3.4353f, 14.8233f)
                lineTo(4.0353f, 11.8233f)
                curveTo(4.4971f, 9.5144f, 4.728f, 8.36f, 5.5574f, 7.68f)
                curveTo(6.1625f, 7.1839f, 6.9527f, 7.0497f, 8.2501f, 7.0135f)
                close()
                moveTo(9.75f, 6.0f)
                curveTo(9.75f, 4.7574f, 10.7574f, 3.75f, 12.0f, 3.75f)
                curveTo(13.2426f, 3.75f, 14.25f, 4.7574f, 14.25f, 6.0f)
                verticalLineTo(7.0f)
                curveTo(14.25f, 7.0f, 14.25f, 7.0f, 14.25f, 7.0f)
                curveTo(14.1944f, 7.0f, 14.1381f, 7.0f, 14.0812f, 7.0f)
                horizontalLineTo(9.9188f)
                curveTo(9.8618f, 7.0f, 9.8056f, 7.0f, 9.75f, 7.0f)
                curveTo(9.75f, 7.0f, 9.75f, 7.0f, 9.75f, 7.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(15.5523f, 11.0f, 16.0f, 10.5523f, 16.0f, 10.0f)
                curveTo(16.0f, 9.4477f, 15.5523f, 9.0f, 15.0f, 9.0f)
                curveTo(14.4477f, 9.0f, 14.0f, 9.4477f, 14.0f, 10.0f)
                curveTo(14.0f, 10.5523f, 14.4477f, 11.0f, 15.0f, 11.0f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(10.0f, 10.5523f, 9.5523f, 11.0f, 9.0f, 11.0f)
                curveTo(8.4477f, 11.0f, 8.0f, 10.5523f, 8.0f, 10.0f)
                curveTo(8.0f, 9.4477f, 8.4477f, 9.0f, 9.0f, 9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 9.4477f, 10.0f, 10.0f)
                close()
            }
        }
            .build()
        return _bag4!!
    }

private var _bag4: ImageVector? = null
