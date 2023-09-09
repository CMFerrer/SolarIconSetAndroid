package com.chiksmedina.solar.bold.weather

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
import com.chiksmedina.solar.bold.WeatherGroup

public val WeatherGroup.CloudWaterdrops: ImageVector
    get() {
        if (_cloudWaterdrops != null) {
            return _cloudWaterdrops!!
        }
        _cloudWaterdrops = Builder(name = "CloudWaterdrops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.3336f)
                curveTo(11.0f, 21.2541f, 10.3284f, 22.0002f, 9.5f, 22.0002f)
                curveTo(8.6716f, 22.0002f, 8.0f, 21.2541f, 8.0f, 20.3336f)
                curveTo(8.0f, 19.8287f, 8.4512f, 19.1758f, 8.8587f, 18.689f)
                curveTo(9.1983f, 18.2833f, 9.8017f, 18.2833f, 10.1413f, 18.689f)
                curveTo(10.5488f, 19.1758f, 11.0f, 19.8287f, 11.0f, 20.3336f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.3336f)
                curveTo(16.0f, 21.2541f, 15.3284f, 22.0002f, 14.5f, 22.0002f)
                curveTo(13.6716f, 22.0002f, 13.0f, 21.2541f, 13.0f, 20.3336f)
                curveTo(13.0f, 19.8287f, 13.4512f, 19.1758f, 13.8587f, 18.689f)
                curveTo(14.1983f, 18.2833f, 14.8017f, 18.2833f, 15.1413f, 18.689f)
                curveTo(15.5488f, 19.1758f, 16.0f, 19.8287f, 16.0f, 20.3336f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 15.3336f)
                curveTo(13.5f, 16.2541f, 12.8284f, 17.0002f, 12.0f, 17.0002f)
                curveTo(11.1716f, 17.0002f, 10.5f, 16.2541f, 10.5f, 15.3336f)
                curveTo(10.5f, 14.8287f, 10.9512f, 14.1758f, 11.3587f, 13.689f)
                curveTo(11.6983f, 13.2833f, 12.3017f, 13.2833f, 12.6413f, 13.689f)
                curveTo(13.0488f, 14.1758f, 13.5f, 14.8287f, 13.5f, 15.3336f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.846f, 19.0f)
                curveTo(6.8893f, 18.9129f, 6.9327f, 18.833f, 6.9735f, 18.7616f)
                curveTo(7.1985f, 18.3668f, 7.4747f, 18.0055f, 7.7085f, 17.7261f)
                curveTo(8.152f, 17.1964f, 8.7661f, 16.9169f, 9.3897f, 16.8874f)
                curveTo(9.1376f, 16.4125f, 9.0f, 15.8745f, 9.0f, 15.3336f)
                curveTo(9.0f, 14.6862f, 9.2695f, 14.1193f, 9.4735f, 13.7616f)
                curveTo(9.6985f, 13.3668f, 9.9747f, 13.0055f, 10.2085f, 12.7261f)
                curveTo(11.1477f, 11.6043f, 12.8523f, 11.6043f, 13.7915f, 12.7261f)
                curveTo(14.0253f, 13.0055f, 14.3015f, 13.3668f, 14.5265f, 13.7616f)
                curveTo(14.7305f, 14.1193f, 15.0f, 14.6862f, 15.0f, 15.3336f)
                curveTo(15.0f, 15.8745f, 14.8624f, 16.4125f, 14.6103f, 16.8874f)
                curveTo(15.2339f, 16.9169f, 15.848f, 17.1964f, 16.2915f, 17.7261f)
                curveTo(16.5253f, 18.0055f, 16.8015f, 18.3668f, 17.0265f, 18.7616f)
                curveTo(17.0577f, 18.8162f, 17.0904f, 18.8758f, 17.1234f, 18.9397f)
                curveTo(19.8822f, 18.5392f, 22.0f, 16.1905f, 22.0f, 13.3529f)
                curveTo(22.0f, 10.8811f, 20.393f, 8.7802f, 18.1551f, 8.015f)
                curveTo(17.8371f, 5.1937f, 15.4159f, 3.0f, 12.4762f, 3.0f)
                curveTo(9.3203f, 3.0f, 6.7619f, 5.5283f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 9.3369f, 6.8871f, 9.9978f, 7.1162f, 10.6089f)
                curveTo(6.8475f, 10.5567f, 6.5698f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(3.9188f, 10.5294f, 2.0f, 12.4256f, 2.0f, 14.7647f)
                curveTo(2.0f, 17.1038f, 3.9188f, 19.0f, 6.2857f, 19.0f)
                horizontalLineTo(6.846f)
                close()
            }
        }
        .build()
        return _cloudWaterdrops!!
    }

private var _cloudWaterdrops: ImageVector? = null
