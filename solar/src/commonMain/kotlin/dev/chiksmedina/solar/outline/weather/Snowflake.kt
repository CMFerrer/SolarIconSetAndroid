package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

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
                curveTo(14.7626f, 2.1768f, 15.2375f, 2.1768f, 15.5303f, 2.4697f)
                curveTo(15.8232f, 2.7626f, 15.8232f, 3.2374f, 15.5303f, 3.5303f)
                lineTo(12.75f, 6.3107f)
                verticalLineTo(10.701f)
                lineTo(16.552f, 8.5059f)
                lineTo(17.5697f, 4.7079f)
                curveTo(17.6769f, 4.3078f, 18.0882f, 4.0703f, 18.4883f, 4.1775f)
                curveTo(18.8884f, 4.2847f, 19.1258f, 4.696f, 19.0186f, 5.0961f)
                lineTo(18.3892f, 7.4452f)
                lineTo(20.2852f, 6.3506f)
                curveTo(20.6439f, 6.1434f, 21.1026f, 6.2663f, 21.3097f, 6.6251f)
                curveTo(21.5168f, 6.9838f, 21.3939f, 7.4425f, 21.0352f, 7.6496f)
                lineTo(19.1392f, 8.7443f)
                lineTo(21.4883f, 9.3737f)
                curveTo(21.8884f, 9.4809f, 22.1258f, 9.8922f, 22.0186f, 10.2923f)
                curveTo(21.9114f, 10.6924f, 21.5001f, 10.9298f, 21.1f, 10.8226f)
                lineTo(17.302f, 9.8049f)
                lineTo(13.5f, 12.0f)
                lineTo(17.3022f, 14.1952f)
                lineTo(21.1002f, 13.1775f)
                curveTo(21.5003f, 13.0703f, 21.9116f, 13.3078f, 22.0188f, 13.7079f)
                curveTo(22.126f, 14.108f, 21.8886f, 14.5192f, 21.4885f, 14.6264f)
                lineTo(19.1393f, 15.2559f)
                lineTo(21.0354f, 16.3505f)
                curveTo(21.3941f, 16.5577f, 21.517f, 17.0163f, 21.3099f, 17.3751f)
                curveTo(21.1028f, 17.7338f, 20.6441f, 17.8567f, 20.2854f, 17.6496f)
                lineTo(18.3893f, 16.5549f)
                lineTo(19.0188f, 18.904f)
                curveTo(19.126f, 19.3041f, 18.8886f, 19.7154f, 18.4885f, 19.8226f)
                curveTo(18.0884f, 19.9298f, 17.6771f, 19.6924f, 17.5699f, 19.2923f)
                lineTo(16.5522f, 15.4943f)
                lineTo(12.75f, 13.299f)
                verticalLineTo(17.6893f)
                lineTo(15.5303f, 20.4697f)
                curveTo(15.8232f, 20.7626f, 15.8232f, 21.2374f, 15.5303f, 21.5303f)
                curveTo(15.2375f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                lineTo(12.75f, 19.8107f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(19.8107f)
                lineTo(9.5303f, 21.5303f)
                curveTo(9.2375f, 21.8232f, 8.7626f, 21.8232f, 8.4697f, 21.5303f)
                curveTo(8.1768f, 21.2374f, 8.1768f, 20.7626f, 8.4697f, 20.4697f)
                lineTo(11.25f, 17.6893f)
                verticalLineTo(13.299f)
                lineTo(7.4478f, 15.4943f)
                lineTo(6.4301f, 19.2923f)
                curveTo(6.3229f, 19.6924f, 5.9117f, 19.9298f, 5.5116f, 19.8226f)
                curveTo(5.1115f, 19.7154f, 4.874f, 19.3041f, 4.9812f, 18.904f)
                lineTo(5.6107f, 16.5549f)
                lineTo(3.7147f, 17.6496f)
                curveTo(3.356f, 17.8567f, 2.8972f, 17.7338f, 2.6902f, 17.3751f)
                curveTo(2.483f, 17.0163f, 2.606f, 16.5577f, 2.9647f, 16.3505f)
                lineTo(4.8607f, 15.2559f)
                lineTo(2.5116f, 14.6264f)
                curveTo(2.1115f, 14.5192f, 1.874f, 14.108f, 1.9813f, 13.7079f)
                curveTo(2.0884f, 13.3078f, 2.4997f, 13.0703f, 2.8998f, 13.1775f)
                lineTo(6.6978f, 14.1952f)
                lineTo(10.5f, 12.0f)
                lineTo(6.698f, 9.8049f)
                lineTo(2.9f, 10.8226f)
                curveTo(2.4999f, 10.9298f, 2.0886f, 10.6924f, 1.9814f, 10.2923f)
                curveTo(1.8742f, 9.8922f, 2.1117f, 9.4809f, 2.5118f, 9.3737f)
                lineTo(4.8609f, 8.7443f)
                lineTo(2.9649f, 7.6496f)
                curveTo(2.6061f, 7.4425f, 2.4832f, 6.9838f, 2.6903f, 6.6251f)
                curveTo(2.8974f, 6.2663f, 3.3561f, 6.1434f, 3.7149f, 6.3506f)
                lineTo(5.6109f, 7.4452f)
                lineTo(4.9814f, 5.0961f)
                curveTo(4.8742f, 4.696f, 5.1117f, 4.2847f, 5.5118f, 4.1775f)
                curveTo(5.9119f, 4.0703f, 6.3231f, 4.3078f, 6.4303f, 4.7079f)
                lineTo(7.448f, 8.5059f)
                lineTo(11.25f, 10.701f)
                verticalLineTo(6.3107f)
                lineTo(8.4697f, 3.5303f)
                curveTo(8.1768f, 3.2374f, 8.1768f, 2.7626f, 8.4697f, 2.4697f)
                curveTo(8.7626f, 2.1768f, 9.2375f, 2.1768f, 9.5303f, 2.4697f)
                lineTo(11.25f, 4.1893f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
            }
        }
            .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
