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

public val ShoppingEcommerceGroup.Bag5: ImageVector
    get() {
        if (_bag5 != null) {
            return _bag5!!
        }
        _bag5 = Builder(name = "Bag5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.25f, 7.0015f)
                lineTo(8.25f, 6.0f)
                curveTo(8.25f, 3.9289f, 9.9289f, 2.25f, 12.0f, 2.25f)
                curveTo(14.0711f, 2.25f, 15.75f, 3.9289f, 15.75f, 6.0f)
                verticalLineTo(7.0f)
                lineTo(15.75f, 7.0015f)
                curveTo(18.4344f, 7.0136f, 19.8606f, 7.1222f, 20.6606f, 8.098f)
                curveTo(21.5608f, 9.1961f, 21.2287f, 10.8563f, 20.5646f, 14.1767f)
                lineTo(19.9646f, 17.1767f)
                curveTo(19.5029f, 19.4856f, 19.272f, 20.6401f, 18.4425f, 21.32f)
                curveTo(17.6131f, 22.0f, 16.4358f, 22.0f, 14.0812f, 22.0f)
                horizontalLineTo(9.9188f)
                curveTo(7.5642f, 22.0f, 6.3869f, 22.0f, 5.5574f, 21.32f)
                curveTo(4.728f, 20.6401f, 4.4971f, 19.4856f, 4.0353f, 17.1767f)
                lineTo(3.4353f, 14.1767f)
                curveTo(2.7712f, 10.8563f, 2.4392f, 9.1961f, 3.3394f, 8.098f)
                curveTo(4.1394f, 7.1222f, 5.5656f, 7.0136f, 8.25f, 7.0015f)
                close()
                moveTo(9.75f, 6.0f)
                curveTo(9.75f, 4.7574f, 10.7574f, 3.75f, 12.0f, 3.75f)
                curveTo(13.2426f, 3.75f, 14.25f, 4.7574f, 14.25f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.75f)
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
        return _bag5!!
    }

private var _bag5: ImageVector? = null
