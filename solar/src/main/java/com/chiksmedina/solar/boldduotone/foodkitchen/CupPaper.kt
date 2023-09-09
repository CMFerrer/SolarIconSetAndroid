package com.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.FoodKitchenGroup

public val FoodKitchenGroup.CupPaper: ImageVector
    get() {
        if (_cupPaper != null) {
            return _cupPaper!!
        }
        _cupPaper = Builder(name = "CupPaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8149f, 2.0f)
                horizontalLineTo(9.1853f)
                curveTo(7.3475f, 2.0f, 6.4286f, 2.0f, 5.7059f, 2.4443f)
                curveTo(5.5812f, 2.521f, 5.4622f, 2.6067f, 5.35f, 2.7007f)
                curveTo(4.6998f, 3.2456f, 4.4089f, 4.1173f, 3.8272f, 5.8606f)
                lineTo(3.7914f, 5.9679f)
                curveTo(3.4726f, 6.9232f, 3.3133f, 7.4008f, 3.4816f, 7.762f)
                curveTo(3.5348f, 7.8759f, 3.6089f, 7.9788f, 3.7002f, 8.0653f)
                curveTo(3.9895f, 8.3394f, 4.493f, 8.3394f, 5.5001f, 8.3394f)
                horizontalLineTo(18.5001f)
                curveTo(19.5071f, 8.3394f, 20.0106f, 8.3394f, 20.2999f, 8.0653f)
                curveTo(20.3912f, 7.9788f, 20.4653f, 7.8759f, 20.5185f, 7.762f)
                curveTo(20.6869f, 7.4008f, 20.5275f, 6.9232f, 20.2087f, 5.9679f)
                lineTo(20.1729f, 5.8606f)
                lineTo(20.1729f, 5.8605f)
                curveTo(19.5912f, 4.1173f, 19.3003f, 3.2456f, 18.6501f, 2.7007f)
                curveTo(18.5379f, 2.6067f, 18.419f, 2.521f, 18.2943f, 2.4443f)
                curveTo(17.5715f, 2.0f, 16.6526f, 2.0f, 14.8149f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.958f, 22.0f)
                horizontalLineTo(13.044f)
                curveTo(14.6926f, 22.0f, 15.517f, 22.0f, 16.0802f, 21.5132f)
                curveTo(16.6435f, 21.0264f, 16.7629f, 20.2107f, 17.0018f, 18.5794f)
                lineTo(18.501f, 8.3394f)
                horizontalLineTo(5.501f)
                lineTo(7.0002f, 18.5794f)
                curveTo(7.239f, 20.2107f, 7.3584f, 21.0264f, 7.9217f, 21.5132f)
                curveTo(8.485f, 22.0f, 9.3093f, 22.0f, 10.958f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7689f, 17.0f)
                horizontalLineTo(17.233f)
                lineTo(17.965f, 12.0f)
                horizontalLineTo(6.0369f)
                lineTo(6.7689f, 17.0f)
                close()
            }
        }
        .build()
        return _cupPaper!!
    }

private var _cupPaper: ImageVector? = null
