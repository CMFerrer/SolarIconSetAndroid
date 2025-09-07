package com.chiksmedina.solar.outline.weather

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
import com.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(
            name = "CloudDownload", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 15.25f)
                curveTo(12.4142f, 15.25f, 12.75f, 15.5858f, 12.75f, 16.0f)
                verticalLineTo(20.1893f)
                lineTo(13.4697f, 19.4697f)
                curveTo(13.7626f, 19.1768f, 14.2374f, 19.1768f, 14.5303f, 19.4697f)
                curveTo(14.8232f, 19.7626f, 14.8232f, 20.2374f, 14.5303f, 20.5303f)
                lineTo(12.5303f, 22.5303f)
                curveTo(12.2374f, 22.8232f, 11.7626f, 22.8232f, 11.4697f, 22.5303f)
                lineTo(9.4697f, 20.5303f)
                curveTo(9.1768f, 20.2374f, 9.1768f, 19.7626f, 9.4697f, 19.4697f)
                curveTo(9.7626f, 19.1768f, 10.2374f, 19.1768f, 10.5303f, 19.4697f)
                lineTo(11.25f, 20.1893f)
                verticalLineTo(16.0f)
                curveTo(11.25f, 15.5858f, 11.5858f, 15.25f, 12.0f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.2262f, 3.5f)
                curveTo(9.4761f, 3.5f, 7.2619f, 5.7008f, 7.2619f, 8.3971f)
                curveTo(7.2619f, 8.8592f, 7.3266f, 9.3055f, 7.4473f, 9.7281f)
                curveTo(7.9445f, 9.8716f, 8.4099f, 10.0889f, 8.8305f, 10.3671f)
                curveTo(9.1759f, 10.5956f, 9.2707f, 11.0609f, 9.0422f, 11.4064f)
                curveTo(8.8137f, 11.7519f, 8.3483f, 11.8467f, 8.0029f, 11.6181f)
                curveTo(7.6221f, 11.3662f, 7.1892f, 11.1855f, 6.7233f, 11.0951f)
                curveTo(6.5015f, 11.0521f, 6.2716f, 11.0294f, 6.0357f, 11.0294f)
                curveTo(4.0746f, 11.0294f, 2.5f, 12.5982f, 2.5f, 14.5147f)
                curveTo(2.5f, 16.4312f, 4.0746f, 18.0f, 6.0357f, 18.0f)
                curveTo(6.4499f, 18.0f, 6.7857f, 18.3358f, 6.7857f, 18.75f)
                curveTo(6.7857f, 19.1642f, 6.4499f, 19.5f, 6.0357f, 19.5f)
                curveTo(3.263f, 19.5f, 1.0f, 17.2764f, 1.0f, 14.5147f)
                curveTo(1.0f, 11.8105f, 3.1699f, 9.6221f, 5.8635f, 9.5323f)
                curveTo(5.7967f, 9.1636f, 5.7619f, 8.7841f, 5.7619f, 8.3971f)
                curveTo(5.7619f, 4.8557f, 8.6645f, 2.0f, 12.2262f, 2.0f)
                curveTo(15.3843f, 2.0f, 18.0224f, 4.2437f, 18.5814f, 7.2213f)
                curveTo(20.8813f, 8.1975f, 22.5f, 10.4593f, 22.5f, 13.1029f)
                curveTo(22.5f, 16.1769f, 20.3123f, 18.7343f, 17.4068f, 19.3557f)
                curveTo(17.0018f, 19.4423f, 16.6032f, 19.1841f, 16.5166f, 18.7791f)
                curveTo(16.43f, 18.374f, 16.6881f, 17.9754f, 17.0932f, 17.8888f)
                curveTo(19.3329f, 17.4098f, 21.0f, 15.443f, 21.0f, 13.1029f)
                curveTo(21.0f, 10.9662f, 19.6107f, 9.1409f, 17.6624f, 8.4746f)
                curveTo(17.1538f, 8.3007f, 16.6068f, 8.2059f, 16.0357f, 8.2059f)
                curveTo(15.4531f, 8.2059f, 14.8955f, 8.3046f, 14.3783f, 8.4853f)
                curveTo(13.9872f, 8.6219f, 13.5595f, 8.4156f, 13.4229f, 8.0245f)
                curveTo(13.2863f, 7.6335f, 13.4926f, 7.2057f, 13.8836f, 7.0692f)
                curveTo(14.5579f, 6.8336f, 15.2826f, 6.7059f, 16.0357f, 6.7059f)
                curveTo(16.3312f, 6.7059f, 16.6223f, 6.7256f, 16.9077f, 6.7637f)
                curveTo(16.227f, 4.8663f, 14.3922f, 3.5f, 12.2262f, 3.5f)
                close()
            }
        }
            .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
