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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 12.0f)
                lineTo(10.0f, 16.0f)
                moveTo(10.0f, 12.0f)
                lineTo(14.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.3431f, 10.3431f, 2.0f, 12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.2235f, 12.5257f)
                curveTo(19.6382f, 9.4045f, 19.3456f, 7.8439f, 18.2347f, 6.922f)
                curveTo(17.1238f, 6.0f, 15.5361f, 6.0f, 12.3605f, 6.0f)
                horizontalLineTo(11.6393f)
                curveTo(8.4637f, 6.0f, 6.876f, 6.0f, 5.7651f, 6.922f)
                curveTo(4.6542f, 7.8439f, 4.3615f, 9.4045f, 3.7763f, 12.5257f)
                curveTo(2.9534f, 16.9146f, 2.5419f, 19.1091f, 3.7416f, 20.5545f)
                curveTo(4.9412f, 22.0f, 7.1739f, 22.0f, 11.6393f, 22.0f)
                horizontalLineTo(12.3605f)
                curveTo(16.8259f, 22.0f, 19.0586f, 22.0f, 20.2582f, 20.5545f)
                curveTo(20.9542f, 19.7159f, 21.1079f, 18.6252f, 20.9536f, 17.0f)
            }
        }
            .build()
        return _bagCross!!
    }

private var _bagCross: ImageVector? = null
