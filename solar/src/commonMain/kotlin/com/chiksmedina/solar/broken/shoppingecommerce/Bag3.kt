package com.chiksmedina.solar.broken.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Bag3: ImageVector
    get() {
        if (_bag3 != null) {
            return _bag3!!
        }
        _bag3 = Builder(
            name = "Bag3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.232f, 10.5257f)
                curveTo(19.6468f, 7.4045f, 19.3542f, 5.8439f, 18.2433f, 4.922f)
                curveTo(17.1324f, 4.0f, 15.5446f, 4.0f, 12.369f, 4.0f)
                horizontalLineTo(11.6479f)
                curveTo(8.4723f, 4.0f, 6.8845f, 4.0f, 5.7736f, 4.922f)
                curveTo(4.6627f, 5.8439f, 4.3701f, 7.4045f, 3.7849f, 10.5257f)
                curveTo(2.962f, 14.9146f, 2.5505f, 17.1091f, 3.7501f, 18.5545f)
                curveTo(4.9497f, 20.0f, 7.1824f, 20.0f, 11.6478f, 20.0f)
                horizontalLineTo(12.369f)
                curveTo(16.8344f, 20.0f, 19.0672f, 20.0f, 20.2668f, 18.5545f)
                curveTo(20.9628f, 17.7159f, 21.1165f, 16.6252f, 20.9621f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1709f, 8.0f)
                curveTo(9.5827f, 9.1652f, 10.694f, 10.0f, 12.0002f, 10.0f)
                curveTo(13.3064f, 10.0f, 14.4177f, 9.1652f, 14.8295f, 8.0f)
            }
        }
            .build()
        return _bag3!!
    }

private var _bag3: ImageVector? = null
