package dev.chiksmedina.solar.boldduotone.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.BusinessStatisticGroup

val BusinessStatisticGroup.PieChart3: ImageVector
    get() {
        if (_pieChart3 != null) {
            return _pieChart3!!
        }
        _pieChart3 = Builder(
            name = "PieChart3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.4443f, 3.6852f)
                curveTo(6.9711f, 3.3331f, 7.5277f, 3.0337f, 8.1058f, 2.7893f)
                curveTo(9.5087f, 2.1962f, 10.2101f, 1.8996f, 11.1051f, 2.4928f)
                curveTo(12.0f, 3.0861f, 12.0f, 4.0574f, 12.0f, 5.9999f)
                verticalLineTo(7.9999f)
                curveTo(12.0f, 9.8855f, 12.0f, 10.8283f, 12.5858f, 11.4141f)
                curveTo(13.1716f, 11.9999f, 14.1144f, 11.9999f, 16.0f, 11.9999f)
                horizontalLineTo(18.0f)
                curveTo(19.9425f, 11.9999f, 20.9138f, 11.9999f, 21.507f, 12.8948f)
                curveTo(22.1003f, 13.7897f, 21.8037f, 14.4912f, 21.2106f, 15.8941f)
                curveTo(20.9662f, 16.4722f, 20.6667f, 17.0287f, 20.3147f, 17.5556f)
                curveTo(19.2159f, 19.2001f, 17.6541f, 20.4818f, 15.8268f, 21.2387f)
                curveTo(13.9996f, 21.9955f, 11.9889f, 22.1936f, 10.0491f, 21.8077f)
                curveTo(8.1093f, 21.4219f, 6.3275f, 20.4695f, 4.9289f, 19.0709f)
                curveTo(3.5304f, 17.6724f, 2.578f, 15.8906f, 2.1922f, 13.9508f)
                curveTo(1.8063f, 12.011f, 2.0043f, 10.0003f, 2.7612f, 8.173f)
                curveTo(3.5181f, 6.3458f, 4.7998f, 4.784f, 6.4443f, 3.6852f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(13.7736f, 2.1282f)
                curveTo(13.8769f, 1.727f, 14.2857f, 1.4856f, 14.6869f, 1.5888f)
                curveTo(18.4655f, 2.5614f, 21.4387f, 5.5345f, 22.4112f, 9.3131f)
                curveTo(22.5145f, 9.7143f, 22.273f, 10.1232f, 21.8718f, 10.2264f)
                curveTo(21.4707f, 10.3297f, 21.0618f, 10.0882f, 20.9586f, 9.687f)
                curveTo(20.1222f, 6.4376f, 17.5624f, 3.8778f, 14.313f, 3.0415f)
                curveTo(13.9119f, 2.9382f, 13.6704f, 2.5293f, 13.7736f, 2.1282f)
                close()
            }
        }
            .build()
        return _pieChart3!!
    }

private var _pieChart3: ImageVector? = null
