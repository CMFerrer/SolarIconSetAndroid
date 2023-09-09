package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(13.8489f, 9.1812f)
                curveTo(13.244f, 9.3416f, 12.4287f, 9.6663f, 11.2543f, 10.136f)
                curveTo(10.7129f, 10.3526f, 10.6121f, 10.4036f, 10.538f, 10.4686f)
                curveTo(10.5134f, 10.4902f, 10.4902f, 10.5134f, 10.4686f, 10.538f)
                curveTo(10.4036f, 10.6121f, 10.3526f, 10.7129f, 10.136f, 11.2543f)
                curveTo(9.6663f, 12.4287f, 9.3416f, 13.244f, 9.1812f, 13.8489f)
                curveTo(9.0142f, 14.4789f, 9.0961f, 14.6399f, 9.1224f, 14.6786f)
                curveTo(9.1755f, 14.7568f, 9.243f, 14.8242f, 9.3212f, 14.8774f)
                curveTo(9.3599f, 14.9037f, 9.5209f, 14.9855f, 10.1508f, 14.8185f)
                curveTo(10.7558f, 14.6581f, 11.571f, 14.3335f, 12.7454f, 13.8637f)
                curveTo(13.2868f, 13.6472f, 13.3876f, 13.5961f, 13.4617f, 13.5311f)
                lineTo(13.9562f, 14.095f)
                lineTo(13.4617f, 13.5311f)
                curveTo(13.4864f, 13.5095f, 13.5095f, 13.4864f, 13.5311f, 13.4617f)
                lineTo(14.095f, 13.9562f)
                lineTo(13.5311f, 13.4617f)
                curveTo(13.5961f, 13.3876f, 13.6472f, 13.2868f, 13.8637f, 12.7454f)
                curveTo(14.3335f, 11.571f, 14.6581f, 10.7558f, 14.8185f, 10.1508f)
                curveTo(14.9855f, 9.5209f, 14.9037f, 9.3599f, 14.8774f, 9.3212f)
                curveTo(14.8242f, 9.243f, 14.7568f, 9.1755f, 14.6786f, 9.1224f)
                curveTo(14.6399f, 9.0961f, 14.4789f, 9.0142f, 13.8489f, 9.1812f)
                close()
                moveTo(13.4646f, 7.7313f)
                curveTo(14.1544f, 7.5484f, 14.9007f, 7.4598f, 15.5217f, 7.8817f)
                curveTo(15.7563f, 8.0412f, 15.9586f, 8.2435f, 16.118f, 8.4781f)
                curveTo(16.54f, 9.0991f, 16.4513f, 9.8453f, 16.2684f, 10.5352f)
                curveTo(16.0817f, 11.2394f, 15.7215f, 12.14f, 15.2766f, 13.2522f)
                lineTo(15.2565f, 13.3025f)
                curveTo(15.2452f, 13.3307f, 15.234f, 13.3586f, 15.223f, 13.3864f)
                curveTo(15.0598f, 13.7958f, 14.9155f, 14.1582f, 14.6589f, 14.4507f)
                curveTo(14.5941f, 14.5246f, 14.5246f, 14.5941f, 14.4507f, 14.6589f)
                curveTo(14.1582f, 14.9155f, 13.7958f, 15.0598f, 13.3864f, 15.223f)
                curveTo(13.3587f, 15.234f, 13.3307f, 15.2452f, 13.3025f, 15.2564f)
                lineTo(13.024f, 14.5601f)
                lineTo(13.3025f, 15.2565f)
                lineTo(13.2522f, 15.2766f)
                curveTo(12.14f, 15.7215f, 11.2394f, 16.0817f, 10.5352f, 16.2684f)
                curveTo(9.8453f, 16.4513f, 9.0991f, 16.54f, 8.4781f, 16.118f)
                lineTo(8.8996f, 15.4977f)
                lineTo(8.4781f, 16.118f)
                curveTo(8.2435f, 15.9586f, 8.0412f, 15.7563f, 7.8817f, 15.5217f)
                curveTo(7.4598f, 14.9007f, 7.5484f, 14.1544f, 7.7313f, 13.4646f)
                curveTo(7.918f, 12.7603f, 8.2783f, 11.8597f, 8.7232f, 10.7476f)
                lineTo(8.7433f, 10.6973f)
                curveTo(8.7546f, 10.6691f, 8.7657f, 10.6411f, 8.7768f, 10.6134f)
                curveTo(8.9399f, 10.2039f, 9.0843f, 9.8416f, 9.3408f, 9.549f)
                curveTo(9.4056f, 9.4752f, 9.4752f, 9.4056f, 9.549f, 9.3408f)
                curveTo(9.8416f, 9.0843f, 10.2039f, 8.9399f, 10.6134f, 8.7768f)
                curveTo(10.6411f, 8.7657f, 10.6691f, 8.7546f, 10.6973f, 8.7433f)
                lineTo(10.7476f, 8.7232f)
                curveTo(11.8598f, 8.2783f, 12.7603f, 7.918f, 13.4646f, 7.7313f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
