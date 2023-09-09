package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(11.3953f, 1.25f, 10.8384f, 1.4003f, 10.2288f, 1.6524f)
                curveTo(9.6401f, 1.8959f, 8.9563f, 2.2547f, 8.1049f, 2.7015f)
                lineTo(6.0374f, 3.7865f)
                curveTo(4.9924f, 4.3349f, 4.1562f, 4.7737f, 3.5105f, 5.2049f)
                curveTo(2.8415f, 5.6516f, 2.3263f, 6.122f, 1.9511f, 6.7592f)
                curveTo(1.5772f, 7.3942f, 1.409f, 8.0818f, 1.3283f, 8.9007f)
                curveTo(1.25f, 9.6956f, 1.25f, 10.6731f, 1.25f, 11.9026f)
                verticalLineTo(12.0974f)
                curveTo(1.25f, 13.3268f, 1.25f, 14.3044f, 1.3283f, 15.0993f)
                curveTo(1.409f, 15.9182f, 1.5772f, 16.6058f, 1.9511f, 17.2408f)
                curveTo(2.3263f, 17.878f, 2.8415f, 18.3484f, 3.5105f, 18.7951f)
                curveTo(4.1562f, 19.2263f, 4.9924f, 19.6651f, 6.0374f, 20.2135f)
                lineTo(8.1048f, 21.2984f)
                curveTo(8.9563f, 21.7453f, 9.6401f, 22.1041f, 10.2288f, 22.3476f)
                curveTo(10.8384f, 22.5997f, 11.3953f, 22.75f, 12.0f, 22.75f)
                curveTo(12.6047f, 22.75f, 13.1616f, 22.5997f, 13.7712f, 22.3476f)
                curveTo(14.3599f, 22.1041f, 15.0437f, 21.7453f, 15.8951f, 21.2985f)
                lineTo(17.9626f, 20.2135f)
                curveTo(19.0076f, 19.6651f, 19.8438f, 19.2263f, 20.4895f, 18.7951f)
                curveTo(21.1585f, 18.3484f, 21.6737f, 17.878f, 22.0489f, 17.2408f)
                curveTo(22.4228f, 16.6058f, 22.591f, 15.9182f, 22.6717f, 15.0993f)
                curveTo(22.75f, 14.3044f, 22.75f, 13.3269f, 22.75f, 12.0975f)
                verticalLineTo(11.9025f)
                curveTo(22.75f, 10.6731f, 22.75f, 9.6956f, 22.6717f, 8.9007f)
                curveTo(22.591f, 8.0818f, 22.4228f, 7.3942f, 22.0489f, 6.7592f)
                curveTo(21.6737f, 6.122f, 21.1585f, 5.6516f, 20.4895f, 5.2049f)
                curveTo(19.8438f, 4.7737f, 19.0076f, 4.3349f, 17.9626f, 3.7865f)
                lineTo(15.8951f, 2.7015f)
                curveTo(15.0437f, 2.2547f, 14.3599f, 1.8959f, 13.7712f, 1.6524f)
                curveTo(13.1616f, 1.4003f, 12.6047f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.7708f, 4.0461f)
                curveTo(9.6605f, 3.5792f, 10.284f, 3.2528f, 10.802f, 3.0386f)
                curveTo(11.3062f, 2.83f, 11.6605f, 2.75f, 12.0f, 2.75f)
                curveTo(12.3395f, 2.75f, 12.6938f, 2.83f, 13.198f, 3.0386f)
                curveTo(13.716f, 3.2528f, 14.3395f, 3.5792f, 15.2292f, 4.0461f)
                lineTo(17.2292f, 5.0956f)
                curveTo(18.3189f, 5.6675f, 19.0845f, 6.0703f, 19.6565f, 6.4523f)
                curveTo(19.9387f, 6.6408f, 20.1604f, 6.8158f, 20.3395f, 6.9917f)
                lineTo(17.0088f, 8.6571f)
                lineTo(8.509f, 4.1835f)
                lineTo(8.7708f, 4.0461f)
                close()
                moveTo(6.9447f, 5.0044f)
                lineTo(6.7708f, 5.0956f)
                curveTo(5.6811f, 5.6675f, 4.9155f, 6.0703f, 4.3435f, 6.4523f)
                curveTo(4.0613f, 6.6408f, 3.8396f, 6.8158f, 3.6605f, 6.9917f)
                lineTo(12.0f, 11.1615f)
                lineTo(15.3572f, 9.4829f)
                lineTo(7.1507f, 5.1637f)
                curveTo(7.071f, 5.1217f, 7.0019f, 5.0674f, 6.9447f, 5.0044f)
                close()
                moveTo(2.9377f, 8.3074f)
                curveTo(2.8872f, 8.5212f, 2.849f, 8.7641f, 2.8211f, 9.0478f)
                curveTo(2.7508f, 9.7606f, 2.75f, 10.6644f, 2.75f, 11.9415f)
                verticalLineTo(12.0585f)
                curveTo(2.75f, 13.3356f, 2.7508f, 14.2394f, 2.8211f, 14.9522f)
                curveTo(2.8897f, 15.6494f, 3.0202f, 16.1002f, 3.2437f, 16.4797f)
                curveTo(3.4659f, 16.857f, 3.7873f, 17.1762f, 4.3435f, 17.5477f)
                curveTo(4.9155f, 17.9297f, 5.6811f, 18.3325f, 6.7708f, 18.9044f)
                lineTo(8.7708f, 19.9539f)
                curveTo(9.6605f, 20.4208f, 10.284f, 20.7472f, 10.802f, 20.9614f)
                curveTo(10.9656f, 21.0291f, 11.1134f, 21.0832f, 11.25f, 21.1255f)
                verticalLineTo(12.4635f)
                lineTo(2.9377f, 8.3074f)
                close()
                moveTo(12.75f, 21.1255f)
                curveTo(12.8866f, 21.0832f, 13.0344f, 21.0291f, 13.198f, 20.9614f)
                curveTo(13.716f, 20.7472f, 14.3395f, 20.4208f, 15.2292f, 19.9539f)
                lineTo(17.2292f, 18.9044f)
                curveTo(18.3189f, 18.3325f, 19.0845f, 17.9297f, 19.6565f, 17.5477f)
                curveTo(20.2127f, 17.1762f, 20.5341f, 16.857f, 20.7563f, 16.4797f)
                curveTo(20.9798f, 16.1002f, 21.1103f, 15.6494f, 21.1789f, 14.9522f)
                curveTo(21.2492f, 14.2394f, 21.25f, 13.3356f, 21.25f, 12.0585f)
                verticalLineTo(11.9415f)
                curveTo(21.25f, 10.6644f, 21.2492f, 9.7606f, 21.1789f, 9.0478f)
                curveTo(21.151f, 8.7641f, 21.1128f, 8.5212f, 21.0623f, 8.3074f)
                lineTo(17.75f, 9.9635f)
                verticalLineTo(13.0f)
                curveTo(17.75f, 13.4142f, 17.4142f, 13.75f, 17.0f, 13.75f)
                curveTo(16.5858f, 13.75f, 16.25f, 13.4142f, 16.25f, 13.0f)
                verticalLineTo(10.7135f)
                lineTo(12.75f, 12.4635f)
                verticalLineTo(21.1255f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
