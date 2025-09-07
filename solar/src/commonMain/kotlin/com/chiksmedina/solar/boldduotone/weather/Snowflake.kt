package com.chiksmedina.solar.boldduotone.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.WeatherGroup

val WeatherGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(
            name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(4.1893f)
                lineTo(14.4697f, 2.4697f)
                curveTo(14.7626f, 2.1768f, 15.2374f, 2.1768f, 15.5303f, 2.4697f)
                curveTo(15.8232f, 2.7626f, 15.8232f, 3.2374f, 15.5303f, 3.5303f)
                lineTo(12.75f, 6.3107f)
                verticalLineTo(17.6893f)
                lineTo(15.5303f, 20.4697f)
                curveTo(15.8232f, 20.7626f, 15.8232f, 21.2374f, 15.5303f, 21.5303f)
                curveTo(15.2374f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                lineTo(12.75f, 19.8107f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(19.8107f)
                lineTo(9.5303f, 21.5303f)
                curveTo(9.2374f, 21.8232f, 8.7626f, 21.8232f, 8.4697f, 21.5303f)
                curveTo(8.1768f, 21.2374f, 8.1768f, 20.7626f, 8.4697f, 20.4697f)
                lineTo(11.25f, 17.6893f)
                verticalLineTo(6.3107f)
                lineTo(8.4697f, 3.5303f)
                curveTo(8.1768f, 3.2374f, 8.1768f, 2.7626f, 8.4697f, 2.4697f)
                curveTo(8.7626f, 2.1768f, 9.2374f, 2.1768f, 9.5303f, 2.4697f)
                lineTo(11.25f, 4.1893f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(5.5116f, 4.1781f)
                curveTo(5.9117f, 4.0709f, 6.3229f, 4.3083f, 6.4302f, 4.7084f)
                lineTo(7.4478f, 8.5064f)
                lineTo(11.9998f, 11.1345f)
                lineTo(16.5518f, 8.5064f)
                lineTo(17.5695f, 4.7084f)
                curveTo(17.6767f, 4.3083f, 18.088f, 4.0709f, 18.4881f, 4.1781f)
                curveTo(18.8882f, 4.2853f, 19.1256f, 4.6965f, 19.0184f, 5.0966f)
                lineTo(18.389f, 7.4458f)
                lineTo(20.285f, 6.3511f)
                curveTo(20.6437f, 6.144f, 21.1024f, 6.2669f, 21.3095f, 6.6256f)
                curveTo(21.5166f, 6.9843f, 21.3937f, 7.443f, 21.035f, 7.6501f)
                lineTo(19.139f, 8.7448f)
                lineTo(21.4881f, 9.3742f)
                curveTo(21.8882f, 9.4814f, 22.1256f, 9.8927f, 22.0184f, 10.2928f)
                curveTo(21.9112f, 10.6929f, 21.5f, 10.9303f, 21.0999f, 10.8231f)
                lineTo(17.3018f, 9.8055f)
                lineTo(13.4998f, 12.0005f)
                lineTo(17.302f, 14.1958f)
                lineTo(21.1f, 13.1781f)
                curveTo(21.5001f, 13.0709f, 21.9114f, 13.3083f, 22.0186f, 13.7084f)
                curveTo(22.1258f, 14.1085f, 21.8884f, 14.5198f, 21.4883f, 14.627f)
                lineTo(19.1392f, 15.2564f)
                lineTo(21.0352f, 16.3511f)
                curveTo(21.3939f, 16.5582f, 21.5168f, 17.0169f, 21.3097f, 17.3756f)
                curveTo(21.1026f, 17.7343f, 20.6439f, 17.8572f, 20.2852f, 17.6501f)
                lineTo(18.3892f, 16.5555f)
                lineTo(19.0186f, 18.9046f)
                curveTo(19.1258f, 19.3047f, 18.8884f, 19.7159f, 18.4883f, 19.8231f)
                curveTo(18.0882f, 19.9303f, 17.6769f, 19.6929f, 17.5697f, 19.2928f)
                lineTo(16.552f, 15.4948f)
                lineTo(11.9998f, 12.8666f)
                lineTo(7.4476f, 15.4948f)
                lineTo(6.43f, 19.2928f)
                curveTo(6.3228f, 19.6929f, 5.9115f, 19.9303f, 5.5114f, 19.8231f)
                curveTo(5.1113f, 19.7159f, 4.8739f, 19.3047f, 4.9811f, 18.9046f)
                lineTo(5.6105f, 16.5555f)
                lineTo(3.7145f, 17.6501f)
                curveTo(3.3558f, 17.8572f, 2.8971f, 17.7343f, 2.69f, 17.3756f)
                curveTo(2.4829f, 17.0169f, 2.6058f, 16.5582f, 2.9645f, 16.3511f)
                lineTo(4.8605f, 15.2564f)
                lineTo(2.5114f, 14.627f)
                curveTo(2.1113f, 14.5198f, 1.8739f, 14.1085f, 1.9811f, 13.7084f)
                curveTo(2.0883f, 13.3083f, 2.4995f, 13.0709f, 2.8996f, 13.1781f)
                lineTo(6.6976f, 14.1958f)
                lineTo(10.4998f, 12.0005f)
                lineTo(6.6978f, 9.8055f)
                lineTo(2.8998f, 10.8231f)
                curveTo(2.4997f, 10.9303f, 2.0885f, 10.6929f, 1.9813f, 10.2928f)
                curveTo(1.8741f, 9.8927f, 2.1115f, 9.4814f, 2.5116f, 9.3742f)
                lineTo(4.8607f, 8.7448f)
                lineTo(2.9647f, 7.6501f)
                curveTo(2.606f, 7.443f, 2.4831f, 6.9843f, 2.6902f, 6.6256f)
                curveTo(2.8973f, 6.2669f, 3.356f, 6.144f, 3.7147f, 6.3511f)
                lineTo(5.6107f, 7.4458f)
                lineTo(4.9813f, 5.0966f)
                curveTo(4.8741f, 4.6965f, 5.1115f, 4.2853f, 5.5116f, 4.1781f)
                close()
            }
        }
            .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
