package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.SliderHorizontal: ImageVector
    get() {
        if (_sliderHorizontal != null) {
            return _sliderHorizontal!!
        }
        _sliderHorizontal = Builder(
            name = "SliderHorizontal", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.4186f)
                curveTo(18.8284f, 6.4186f, 20.2426f, 6.4186f, 21.1213f, 7.236f)
                curveTo(22.0f, 8.0534f, 22.0f, 9.3689f, 22.0f, 12.0f)
                curveTo(22.0f, 14.6311f, 22.0f, 15.9466f, 21.1213f, 16.764f)
                curveTo(20.2426f, 17.5814f, 18.8284f, 17.5814f, 16.0f, 17.5814f)
                lineTo(8.0f, 17.5814f)
                curveTo(5.1716f, 17.5814f, 3.7574f, 17.5814f, 2.8787f, 16.764f)
                curveTo(2.0f, 15.9466f, 2.0f, 14.6311f, 2.0f, 12.0f)
                curveTo(2.0f, 9.3689f, 2.0f, 8.0534f, 2.8787f, 7.236f)
                curveTo(3.7574f, 6.4186f, 5.1716f, 6.4186f, 8.0f, 6.4186f)
                lineTo(16.0f, 6.4186f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0987f, 5.0233f)
                lineTo(16.0f, 5.0233f)
                lineTo(7.9012f, 5.0233f)
                curveTo(6.9185f, 5.0232f, 6.0362f, 5.0231f, 5.2723f, 5.0695f)
                curveTo(5.0026f, 5.0858f, 4.7477f, 5.1079f, 4.5083f, 5.1379f)
                curveTo(4.4008f, 5.1513f, 4.2938f, 5.1666f, 4.1874f, 5.1841f)
                curveTo(3.9713f, 5.2197f, 3.7674f, 5.0526f, 3.7866f, 4.8344f)
                verticalLineTo(4.8344f)
                curveTo(3.8244f, 4.4034f, 3.9051f, 4.0142f, 4.1042f, 3.6507f)
                curveTo(4.4158f, 3.0819f, 4.913f, 2.6194f, 5.5245f, 2.3295f)
                curveTo(5.9153f, 2.1443f, 6.3337f, 2.0692f, 6.7969f, 2.034f)
                curveTo(7.2445f, 2.0f, 7.7952f, 2.0f, 8.4686f, 2.0f)
                lineTo(15.5314f, 2.0f)
                curveTo(16.2048f, 2.0f, 16.7555f, 2.0f, 17.2031f, 2.034f)
                curveTo(17.6663f, 2.0692f, 18.0847f, 2.1443f, 18.4755f, 2.3295f)
                curveTo(19.087f, 2.6194f, 19.5842f, 3.0819f, 19.8958f, 3.6507f)
                curveTo(20.0949f, 4.0142f, 20.1756f, 4.4034f, 20.2134f, 4.8344f)
                verticalLineTo(4.8344f)
                curveTo(20.2326f, 5.0526f, 20.0288f, 5.2197f, 19.8126f, 5.1841f)
                curveTo(19.7062f, 5.1666f, 19.5992f, 5.1513f, 19.4917f, 5.1379f)
                curveTo(19.2523f, 5.1079f, 18.9974f, 5.0858f, 18.7277f, 5.0695f)
                curveTo(17.9638f, 5.0232f, 17.0815f, 5.0232f, 16.0987f, 5.0233f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9013f, 18.9767f)
                lineTo(16.0987f, 18.9767f)
                curveTo(17.0815f, 18.9768f, 17.9638f, 18.9768f, 18.7277f, 18.9305f)
                curveTo(18.9974f, 18.9142f, 19.2523f, 18.8921f, 19.4917f, 18.8621f)
                curveTo(19.5992f, 18.8487f, 19.7062f, 18.8334f, 19.8126f, 18.8159f)
                curveTo(20.0287f, 18.7803f, 20.2326f, 18.9474f, 20.2134f, 19.1656f)
                verticalLineTo(19.1656f)
                curveTo(20.1756f, 19.5966f, 20.0949f, 19.9858f, 19.8958f, 20.3493f)
                curveTo(19.5842f, 20.9181f, 19.087f, 21.3806f, 18.4755f, 21.6705f)
                curveTo(18.0847f, 21.8557f, 17.6663f, 21.9308f, 17.2031f, 21.966f)
                curveTo(16.7555f, 22.0f, 16.2048f, 22.0f, 15.5314f, 22.0f)
                lineTo(8.4686f, 22.0f)
                curveTo(7.7952f, 22.0f, 7.2445f, 22.0f, 6.7969f, 21.966f)
                curveTo(6.3337f, 21.9308f, 5.9153f, 21.8557f, 5.5245f, 21.6705f)
                curveTo(4.913f, 21.3806f, 4.4158f, 20.9181f, 4.1042f, 20.3493f)
                curveTo(3.9051f, 19.9858f, 3.8244f, 19.5966f, 3.7866f, 19.1656f)
                verticalLineTo(19.1656f)
                curveTo(3.7674f, 18.9474f, 3.9713f, 18.7803f, 4.1874f, 18.8159f)
                curveTo(4.2938f, 18.8334f, 4.4008f, 18.8487f, 4.5083f, 18.8621f)
                curveTo(4.7477f, 18.8921f, 5.0026f, 18.9142f, 5.2723f, 18.9305f)
                curveTo(6.0362f, 18.9768f, 6.9185f, 18.9768f, 7.9013f, 18.9767f)
                close()
            }
        }
            .build()
        return _sliderHorizontal!!
    }

private var _sliderHorizontal: ImageVector? = null
