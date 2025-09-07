package com.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FoodKitchenGroup

val FoodKitchenGroup.Ladle: ImageVector
    get() {
        if (_ladle != null) {
            return _ladle!!
        }
        _ladle = Builder(
            name = "Ladle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.9997f, 17.0f)
                curveTo(19.0537f, 17.0f, 21.9997f, 15.8807f, 21.9997f, 14.5f)
                curveTo(21.9997f, 13.1193f, 19.0537f, 12.0f, 15.9997f, 12.0f)
                curveTo(12.9458f, 12.0f, 9.3682f, 13.1193f, 9.3682f, 14.5f)
                curveTo(9.3682f, 15.8807f, 12.9458f, 17.0f, 15.9997f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.4342f, 2.5f)
                curveTo(4.8137f, 2.5f, 3.5f, 3.8137f, 3.5f, 5.4342f)
                curveTo(3.5f, 5.8484f, 3.1642f, 6.1842f, 2.75f, 6.1842f)
                curveTo(2.3358f, 6.1842f, 2.0f, 5.8484f, 2.0f, 5.4342f)
                curveTo(2.0f, 2.9853f, 3.9853f, 1.0f, 6.4342f, 1.0f)
                curveTo(8.8832f, 1.0f, 10.8684f, 2.9853f, 10.8684f, 5.4342f)
                verticalLineTo(13.0024f)
                curveTo(9.9712f, 13.4148f, 9.3825f, 13.9258f, 9.3684f, 14.4797f)
                verticalLineTo(5.4342f)
                curveTo(9.3684f, 3.8137f, 8.0547f, 2.5f, 6.4342f, 2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.3684f, 14.5203f)
                curveTo(9.3766f, 14.8432f, 9.5801f, 15.1515f, 9.9262f, 15.4342f)
                curveTo(11.0498f, 16.3522f, 13.6763f, 17.0f, 15.9997f, 17.0f)
                curveTo(19.0537f, 17.0f, 21.9997f, 15.8807f, 21.9997f, 14.5f)
                verticalLineTo(15.6842f)
                curveTo(21.9997f, 19.1723f, 19.1721f, 22.0f, 15.684f, 22.0f)
                curveTo(12.1958f, 22.0f, 9.3682f, 19.1723f, 9.3682f, 15.6842f)
                verticalLineTo(14.5f)
                curveTo(9.3682f, 14.5068f, 9.3682f, 14.5135f, 9.3684f, 14.5203f)
                close()
            }
        }
            .build()
        return _ladle!!
    }

private var _ladle: ImageVector? = null
