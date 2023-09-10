package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.TrashBin2: ImageVector
    get() {
        if (_trashBin2 != null) {
            return _trashBin2!!
        }
        _trashBin2 = Builder(
            name = "TrashBin2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 6.1667f)
                curveTo(2.75f, 5.7064f, 3.0954f, 5.3334f, 3.5214f, 5.3334f)
                lineTo(6.1857f, 5.3329f)
                curveTo(6.715f, 5.3184f, 7.182f, 4.9548f, 7.3621f, 4.4169f)
                curveTo(7.3669f, 4.4028f, 7.3723f, 4.3853f, 7.3918f, 4.322f)
                lineTo(7.5066f, 3.9499f)
                curveTo(7.5769f, 3.7218f, 7.6381f, 3.523f, 7.7238f, 3.3454f)
                curveTo(8.0621f, 2.6435f, 8.6881f, 2.1561f, 9.4115f, 2.0313f)
                curveTo(9.5946f, 1.9997f, 9.7885f, 1.9999f, 10.0111f, 2.0f)
                horizontalLineTo(13.4891f)
                curveTo(13.7117f, 1.9999f, 13.9056f, 1.9997f, 14.0887f, 2.0313f)
                curveTo(14.8121f, 2.1561f, 15.4381f, 2.6435f, 15.7764f, 3.3454f)
                curveTo(15.8621f, 3.523f, 15.9233f, 3.7218f, 15.9935f, 3.9499f)
                lineTo(16.1083f, 4.322f)
                curveTo(16.1279f, 4.3853f, 16.1333f, 4.4028f, 16.138f, 4.4169f)
                curveTo(16.3182f, 4.9548f, 16.8778f, 5.3189f, 17.4071f, 5.3334f)
                horizontalLineTo(19.9786f)
                curveTo(20.4046f, 5.3334f, 20.75f, 5.7064f, 20.75f, 6.1667f)
                curveTo(20.75f, 6.6269f, 20.4046f, 7.0f, 19.9786f, 7.0f)
                horizontalLineTo(3.5214f)
                curveTo(3.0954f, 7.0f, 2.75f, 6.6269f, 2.75f, 6.1667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.6068f, 21.9998f)
                horizontalLineTo(12.3937f)
                curveTo(15.1012f, 21.9998f, 16.4549f, 21.9998f, 17.3351f, 21.1366f)
                curveTo(18.2153f, 20.2734f, 18.3054f, 18.8575f, 18.4855f, 16.0256f)
                lineTo(18.745f, 11.945f)
                curveTo(18.8427f, 10.4085f, 18.8916f, 9.6402f, 18.45f, 9.1533f)
                curveTo(18.0084f, 8.6665f, 17.2628f, 8.6665f, 15.7714f, 8.6665f)
                horizontalLineTo(8.229f)
                curveTo(6.7377f, 8.6665f, 5.992f, 8.6665f, 5.5505f, 9.1533f)
                curveTo(5.1089f, 9.6402f, 5.1578f, 10.4085f, 5.2555f, 11.945f)
                lineTo(5.515f, 16.0256f)
                curveTo(5.6951f, 18.8575f, 5.7852f, 20.2734f, 6.6653f, 21.1366f)
                curveTo(7.5455f, 21.9998f, 8.8993f, 21.9998f, 11.6068f, 21.9998f)
                close()
            }
        }
            .build()
        return _trashBin2!!
    }

private var _trashBin2: ImageVector? = null
