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

val EssentionalUiGroup.SliderVertical: ImageVector
    get() {
        if (_sliderVertical != null) {
            return _sliderVertical!!
        }
        _sliderVertical = Builder(
            name = "SliderVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.4186f, 8.0f)
                curveTo(6.4186f, 5.1716f, 6.4186f, 3.7574f, 7.236f, 2.8787f)
                curveTo(8.0534f, 2.0f, 9.3689f, 2.0f, 12.0f, 2.0f)
                curveTo(14.6311f, 2.0f, 15.9466f, 2.0f, 16.764f, 2.8787f)
                curveTo(17.5814f, 3.7574f, 17.5814f, 5.1716f, 17.5814f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(17.5814f, 18.8284f, 17.5814f, 20.2426f, 16.764f, 21.1213f)
                curveTo(15.9466f, 22.0f, 14.6311f, 22.0f, 12.0f, 22.0f)
                curveTo(9.3689f, 22.0f, 8.0534f, 22.0f, 7.236f, 21.1213f)
                curveTo(6.4186f, 20.2426f, 6.4186f, 18.8284f, 6.4186f, 16.0f)
                lineTo(6.4186f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0233f, 7.9012f)
                lineTo(5.0233f, 8.0f)
                lineTo(5.0233f, 16.0987f)
                curveTo(5.0232f, 17.0815f, 5.0232f, 17.9638f, 5.0695f, 18.7277f)
                curveTo(5.0858f, 18.9974f, 5.1079f, 19.2523f, 5.1379f, 19.4917f)
                curveTo(5.1513f, 19.5992f, 5.1666f, 19.7062f, 5.1841f, 19.8126f)
                curveTo(5.2197f, 20.0288f, 5.0526f, 20.2326f, 4.8344f, 20.2134f)
                verticalLineTo(20.2134f)
                curveTo(4.4034f, 20.1756f, 4.0142f, 20.0949f, 3.6507f, 19.8958f)
                curveTo(3.0819f, 19.5842f, 2.6194f, 19.087f, 2.3295f, 18.4755f)
                curveTo(2.1443f, 18.0847f, 2.0692f, 17.6663f, 2.034f, 17.2031f)
                curveTo(2.0f, 16.7555f, 2.0f, 16.2048f, 2.0f, 15.5314f)
                lineTo(2.0f, 8.4686f)
                curveTo(2.0f, 7.7952f, 2.0f, 7.2445f, 2.034f, 6.7969f)
                curveTo(2.0692f, 6.3337f, 2.1443f, 5.9153f, 2.3295f, 5.5245f)
                curveTo(2.6194f, 4.913f, 3.0819f, 4.4158f, 3.6507f, 4.1042f)
                curveTo(4.0142f, 3.9051f, 4.4034f, 3.8244f, 4.8344f, 3.7866f)
                verticalLineTo(3.7866f)
                curveTo(5.0526f, 3.7674f, 5.2197f, 3.9713f, 5.1841f, 4.1874f)
                curveTo(5.1666f, 4.2938f, 5.1513f, 4.4008f, 5.1379f, 4.5083f)
                curveTo(5.1079f, 4.7477f, 5.0858f, 5.0026f, 5.0695f, 5.2723f)
                curveTo(5.0232f, 6.0362f, 5.0232f, 6.9185f, 5.0233f, 7.9012f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.9767f, 16.0987f)
                lineTo(18.9767f, 7.9013f)
                curveTo(18.9768f, 6.9185f, 18.9768f, 6.0362f, 18.9305f, 5.2723f)
                curveTo(18.9142f, 5.0026f, 18.8921f, 4.7477f, 18.8621f, 4.5083f)
                curveTo(18.8487f, 4.4008f, 18.8334f, 4.2938f, 18.8159f, 4.1874f)
                curveTo(18.7803f, 3.9713f, 18.9474f, 3.7674f, 19.1656f, 3.7866f)
                verticalLineTo(3.7866f)
                curveTo(19.5966f, 3.8244f, 19.9858f, 3.9051f, 20.3493f, 4.1042f)
                curveTo(20.9181f, 4.4158f, 21.3806f, 4.913f, 21.6705f, 5.5245f)
                curveTo(21.8557f, 5.9153f, 21.9308f, 6.3337f, 21.966f, 6.7969f)
                curveTo(22.0f, 7.2445f, 22.0f, 7.7952f, 22.0f, 8.4686f)
                lineTo(22.0f, 15.5314f)
                curveTo(22.0f, 16.2048f, 22.0f, 16.7555f, 21.966f, 17.2031f)
                curveTo(21.9308f, 17.6663f, 21.8557f, 18.0847f, 21.6705f, 18.4755f)
                curveTo(21.3806f, 19.087f, 20.9181f, 19.5842f, 20.3493f, 19.8958f)
                curveTo(19.9858f, 20.0949f, 19.5966f, 20.1756f, 19.1656f, 20.2134f)
                verticalLineTo(20.2134f)
                curveTo(18.9474f, 20.2326f, 18.7803f, 20.0288f, 18.8159f, 19.8126f)
                curveTo(18.8334f, 19.7062f, 18.8487f, 19.5992f, 18.8621f, 19.4917f)
                curveTo(18.8921f, 19.2523f, 18.9142f, 18.9974f, 18.9305f, 18.7277f)
                curveTo(18.9768f, 17.9638f, 18.9768f, 17.0815f, 18.9767f, 16.0987f)
                close()
            }
        }
            .build()
        return _sliderVertical!!
    }

private var _sliderVertical: ImageVector? = null
