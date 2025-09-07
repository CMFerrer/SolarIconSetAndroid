package com.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.WeatherGroup

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
                moveTo(12.0001f, 1.25f)
                curveTo(12.4143f, 1.25f, 12.7501f, 1.5858f, 12.7501f, 2.0f)
                verticalLineTo(4.1893f)
                lineTo(14.4697f, 2.4697f)
                curveTo(14.7626f, 2.1768f, 15.2375f, 2.1768f, 15.5304f, 2.4697f)
                curveTo(15.8233f, 2.7626f, 15.8233f, 3.2374f, 15.5304f, 3.5303f)
                lineTo(12.7501f, 6.3107f)
                verticalLineTo(10.701f)
                lineTo(16.5521f, 8.5059f)
                lineTo(17.5698f, 4.7079f)
                curveTo(17.677f, 4.3078f, 18.0882f, 4.0703f, 18.4883f, 4.1775f)
                curveTo(18.8884f, 4.2847f, 19.1259f, 4.696f, 19.0187f, 5.0961f)
                lineTo(18.3892f, 7.4452f)
                lineTo(20.2852f, 6.3506f)
                curveTo(20.644f, 6.1434f, 21.1026f, 6.2663f, 21.3098f, 6.6251f)
                curveTo(21.5169f, 6.9838f, 21.394f, 7.4425f, 21.0352f, 7.6496f)
                lineTo(19.1392f, 8.7443f)
                lineTo(21.4883f, 9.3737f)
                curveTo(21.8884f, 9.4809f, 22.1259f, 9.8922f, 22.0187f, 10.2923f)
                curveTo(21.9114f, 10.6924f, 21.5002f, 10.9298f, 21.1001f, 10.8226f)
                lineTo(17.3021f, 9.8049f)
                lineTo(13.5001f, 12.0f)
                lineTo(17.3023f, 14.1952f)
                lineTo(21.1003f, 13.1775f)
                curveTo(21.5004f, 13.0703f, 21.9116f, 13.3078f, 22.0189f, 13.7079f)
                curveTo(22.1261f, 14.108f, 21.8886f, 14.5192f, 21.4885f, 14.6264f)
                lineTo(19.1394f, 15.2559f)
                lineTo(21.0354f, 16.3505f)
                curveTo(21.3942f, 16.5577f, 21.5171f, 17.0163f, 21.31f, 17.3751f)
                curveTo(21.1028f, 17.7338f, 20.6442f, 17.8567f, 20.2854f, 17.6496f)
                lineTo(18.3894f, 16.5549f)
                lineTo(19.0189f, 18.904f)
                curveTo(19.1261f, 19.3041f, 18.8886f, 19.7154f, 18.4885f, 19.8226f)
                curveTo(18.0884f, 19.9298f, 17.6772f, 19.6924f, 17.57f, 19.2923f)
                lineTo(16.5523f, 15.4943f)
                lineTo(12.7501f, 13.299f)
                verticalLineTo(17.6893f)
                lineTo(15.5304f, 20.4697f)
                curveTo(15.8233f, 20.7626f, 15.8233f, 21.2374f, 15.5304f, 21.5303f)
                curveTo(15.2375f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                lineTo(12.7501f, 19.8107f)
                verticalLineTo(22.0f)
                curveTo(12.7501f, 22.4142f, 12.4143f, 22.75f, 12.0001f, 22.75f)
                curveTo(11.5859f, 22.75f, 11.2501f, 22.4142f, 11.2501f, 22.0f)
                verticalLineTo(19.8107f)
                lineTo(9.5304f, 21.5303f)
                curveTo(9.2375f, 21.8232f, 8.7626f, 21.8232f, 8.4698f, 21.5303f)
                curveTo(8.1769f, 21.2374f, 8.1769f, 20.7626f, 8.4698f, 20.4697f)
                lineTo(11.2501f, 17.6893f)
                verticalLineTo(13.299f)
                lineTo(7.4479f, 15.4943f)
                lineTo(6.4302f, 19.2923f)
                curveTo(6.323f, 19.6924f, 5.9117f, 19.9298f, 5.5116f, 19.8226f)
                curveTo(5.1115f, 19.7154f, 4.8741f, 19.3041f, 4.9813f, 18.904f)
                lineTo(5.6108f, 16.5549f)
                lineTo(3.7147f, 17.6496f)
                curveTo(3.356f, 17.8567f, 2.8973f, 17.7338f, 2.6902f, 17.3751f)
                curveTo(2.4831f, 17.0163f, 2.606f, 16.5577f, 2.9647f, 16.3505f)
                lineTo(4.8608f, 15.2559f)
                lineTo(2.5116f, 14.6264f)
                curveTo(2.1115f, 14.5192f, 1.8741f, 14.108f, 1.9813f, 13.7079f)
                curveTo(2.0885f, 13.3078f, 2.4998f, 13.0703f, 2.8999f, 13.1775f)
                lineTo(6.6979f, 14.1952f)
                lineTo(10.5001f, 12.0f)
                lineTo(6.6981f, 9.8049f)
                lineTo(2.9001f, 10.8226f)
                curveTo(2.5f, 10.9298f, 2.0887f, 10.6924f, 1.9815f, 10.2923f)
                curveTo(1.8743f, 9.8922f, 2.1117f, 9.4809f, 2.5118f, 9.3737f)
                lineTo(4.8609f, 8.7443f)
                lineTo(2.9649f, 7.6496f)
                curveTo(2.6062f, 7.4425f, 2.4833f, 6.9838f, 2.6904f, 6.6251f)
                curveTo(2.8975f, 6.2663f, 3.3562f, 6.1434f, 3.7149f, 6.3506f)
                lineTo(5.6109f, 7.4452f)
                lineTo(4.9815f, 5.0961f)
                curveTo(4.8743f, 4.696f, 5.1117f, 4.2847f, 5.5118f, 4.1775f)
                curveTo(5.9119f, 4.0703f, 6.3232f, 4.3078f, 6.4304f, 4.7079f)
                lineTo(7.4481f, 8.5059f)
                lineTo(11.2501f, 10.701f)
                verticalLineTo(6.3107f)
                lineTo(8.4698f, 3.5303f)
                curveTo(8.1769f, 3.2374f, 8.1769f, 2.7626f, 8.4698f, 2.4697f)
                curveTo(8.7626f, 2.1768f, 9.2375f, 2.1768f, 9.5304f, 2.4697f)
                lineTo(11.2501f, 4.1893f)
                verticalLineTo(2.0f)
                curveTo(11.2501f, 1.5858f, 11.5859f, 1.25f, 12.0001f, 1.25f)
                close()
            }
        }
            .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
