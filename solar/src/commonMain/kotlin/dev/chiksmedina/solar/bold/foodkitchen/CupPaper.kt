package dev.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.CupPaper: ImageVector
    get() {
        if (_cupPaper != null) {
            return _cupPaper!!
        }
        _cupPaper = Builder(
            name = "CupPaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.1853f, 2.0f)
                horizontalLineTo(14.8149f)
                curveTo(16.6526f, 2.0f, 17.5715f, 2.0f, 18.2943f, 2.4443f)
                curveTo(18.419f, 2.521f, 18.5379f, 2.6067f, 18.6501f, 2.7007f)
                curveTo(19.3003f, 3.2456f, 19.5912f, 4.1173f, 20.1729f, 5.8605f)
                lineTo(20.2087f, 5.9679f)
                curveTo(20.5275f, 6.9232f, 20.6869f, 7.4008f, 20.5185f, 7.762f)
                curveTo(20.4653f, 7.8759f, 20.3912f, 7.9788f, 20.2999f, 8.0653f)
                curveTo(20.0106f, 8.3394f, 19.5071f, 8.3394f, 18.5001f, 8.3394f)
                lineTo(18.0739f, 11.25f)
                horizontalLineTo(5.9261f)
                lineTo(5.5f, 8.3394f)
                curveTo(4.493f, 8.3394f, 3.9895f, 8.3394f, 3.7002f, 8.0653f)
                curveTo(3.6089f, 7.9788f, 3.5348f, 7.8759f, 3.4816f, 7.762f)
                curveTo(3.3133f, 7.4008f, 3.4726f, 6.9232f, 3.7914f, 5.9679f)
                lineTo(3.8272f, 5.8606f)
                curveTo(4.4089f, 4.1173f, 4.6998f, 3.2456f, 5.35f, 2.7007f)
                curveTo(5.4622f, 2.6067f, 5.5812f, 2.521f, 5.7059f, 2.4443f)
                curveTo(6.4286f, 2.0f, 7.3475f, 2.0f, 9.1853f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.3418f, 16.25f)
                horizontalLineTo(6.6582f)
                lineTo(6.1458f, 12.75f)
                horizontalLineTo(17.8543f)
                lineTo(17.3418f, 16.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.043f, 22.0f)
                horizontalLineTo(10.957f)
                curveTo(9.3083f, 22.0f, 8.484f, 22.0f, 7.9207f, 21.5132f)
                curveTo(7.3575f, 21.0264f, 7.238f, 20.2107f, 6.9992f, 18.5794f)
                lineTo(6.8778f, 17.75f)
                horizontalLineTo(17.1222f)
                lineTo(17.0008f, 18.5794f)
                curveTo(16.762f, 20.2107f, 16.6425f, 21.0264f, 16.0793f, 21.5132f)
                curveTo(15.516f, 22.0f, 14.6917f, 22.0f, 13.043f, 22.0f)
                close()
            }
        }
            .build()
        return _cupPaper!!
    }

private var _cupPaper: ImageVector? = null
