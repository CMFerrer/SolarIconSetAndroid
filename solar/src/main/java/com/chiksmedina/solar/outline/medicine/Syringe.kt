package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MedicineGroup

public val MedicineGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5606f, 3.4697f)
                curveTo(16.8535f, 3.1768f, 17.3283f, 3.1768f, 17.6212f, 3.4697f)
                lineTo(20.5303f, 6.3788f)
                curveTo(20.8232f, 6.6716f, 20.8232f, 7.1465f, 20.5303f, 7.4394f)
                curveTo(20.2374f, 7.7323f, 19.7626f, 7.7323f, 19.4697f, 7.4394f)
                lineTo(18.5455f, 6.5152f)
                lineTo(17.4243f, 7.6364f)
                lineTo(18.2877f, 8.4997f)
                curveTo(18.6475f, 8.8596f, 18.9471f, 9.1591f, 19.1736f, 9.4228f)
                curveTo(19.4095f, 9.6973f, 19.6068f, 9.9779f, 19.7287f, 10.3127f)
                curveTo(19.9544f, 10.9328f, 19.9544f, 11.6126f, 19.7287f, 12.2328f)
                curveTo(19.6068f, 12.5675f, 19.4095f, 12.8482f, 19.1736f, 13.1226f)
                curveTo(18.9471f, 13.3863f, 18.6475f, 13.6859f, 18.2877f, 14.0457f)
                lineTo(17.6219f, 14.7115f)
                curveTo(17.6217f, 14.7117f, 17.6221f, 14.7113f, 17.6219f, 14.7115f)
                curveTo(17.6217f, 14.7117f, 17.6208f, 14.7126f, 17.6206f, 14.7128f)
                lineTo(15.4403f, 16.8931f)
                curveTo(15.44f, 16.8934f, 15.4397f, 16.8937f, 15.4394f, 16.894f)
                curveTo(15.4391f, 16.8942f, 15.4389f, 16.8945f, 15.4386f, 16.8948f)
                lineTo(13.9849f, 18.3485f)
                curveTo(13.94f, 18.3934f, 13.8946f, 18.4374f, 13.8487f, 18.4805f)
                curveTo(13.8343f, 18.4976f, 13.8191f, 18.5142f, 13.8031f, 18.5303f)
                curveTo(13.769f, 18.5644f, 13.7324f, 18.5945f, 13.694f, 18.6207f)
                curveTo(11.5677f, 20.4809f, 8.4235f, 20.5558f, 6.2153f, 18.8454f)
                lineTo(4.5303f, 20.5303f)
                curveTo(4.2374f, 20.8232f, 3.7626f, 20.8232f, 3.4697f, 20.5303f)
                curveTo(3.1768f, 20.2374f, 3.1768f, 19.7626f, 3.4697f, 19.4697f)
                lineTo(5.1546f, 17.7847f)
                curveTo(3.3643f, 15.4735f, 3.5299f, 12.1367f, 5.6515f, 10.0151f)
                lineTo(9.9543f, 5.7123f)
                curveTo(10.3141f, 5.3524f, 10.6137f, 5.0529f, 10.8774f, 4.8264f)
                curveTo(11.1518f, 4.5905f, 11.4325f, 4.3932f, 11.7672f, 4.2713f)
                curveTo(12.3874f, 4.0456f, 13.0672f, 4.0456f, 13.6873f, 4.2713f)
                curveTo(14.0221f, 4.3932f, 14.3027f, 4.5905f, 14.5772f, 4.8264f)
                curveTo(14.8409f, 5.0529f, 15.1404f, 5.3525f, 15.5003f, 5.7123f)
                lineTo(16.3636f, 6.5757f)
                lineTo(17.4848f, 5.4545f)
                lineTo(16.5606f, 4.5303f)
                curveTo(16.2677f, 4.2374f, 16.2677f, 3.7626f, 16.5606f, 3.4697f)
                close()
                moveTo(14.4596f, 6.793f)
                curveTo(14.0746f, 6.408f, 13.8151f, 6.1492f, 13.5997f, 5.9641f)
                curveTo(13.3901f, 5.7841f, 13.2681f, 5.715f, 13.1743f, 5.6809f)
                curveTo(12.8855f, 5.5758f, 12.569f, 5.5758f, 12.2802f, 5.6809f)
                curveTo(12.1864f, 5.715f, 12.0644f, 5.7841f, 11.8549f, 5.9641f)
                curveTo(11.6394f, 6.1492f, 11.3799f, 6.408f, 10.995f, 6.793f)
                lineTo(10.8788f, 6.9091f)
                lineTo(17.0909f, 13.1212f)
                lineTo(17.207f, 13.005f)
                curveTo(17.592f, 12.6201f, 17.8508f, 12.3606f, 18.0359f, 12.1451f)
                curveTo(18.2159f, 11.9356f, 18.285f, 11.8136f, 18.3191f, 11.7198f)
                curveTo(18.4242f, 11.431f, 18.4242f, 11.1145f, 18.3191f, 10.8257f)
                curveTo(18.285f, 10.7319f, 18.2159f, 10.6099f, 18.0359f, 10.4003f)
                curveTo(17.8508f, 10.1849f, 17.592f, 9.9254f, 17.207f, 9.5404f)
                lineTo(14.4596f, 6.793f)
                close()
                moveTo(16.0302f, 14.1818f)
                lineTo(9.8182f, 7.9697f)
                lineTo(6.7122f, 11.0758f)
                curveTo(4.9967f, 12.7912f, 4.9967f, 15.5724f, 6.7122f, 17.2879f)
                curveTo(8.1825f, 18.7582f, 10.436f, 18.9683f, 12.13f, 17.918f)
                lineTo(11.0965f, 16.8844f)
                curveTo(10.8036f, 16.5915f, 10.8036f, 16.1166f, 11.0965f, 15.8237f)
                curveTo(11.3894f, 15.5308f, 11.8642f, 15.5308f, 12.1571f, 15.8237f)
                lineTo(13.2727f, 16.9393f)
                lineTo(13.8484f, 16.3636f)
                lineTo(11.4934f, 14.0086f)
                curveTo(11.2005f, 13.7157f, 11.2005f, 13.2408f, 11.4934f, 12.9479f)
                curveTo(11.7863f, 12.655f, 12.2612f, 12.655f, 12.5541f, 12.9479f)
                lineTo(14.9091f, 15.303f)
                lineTo(16.0302f, 14.1818f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
