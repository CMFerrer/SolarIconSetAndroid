package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(
            name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.6157f)
                curveTo(2.0f, 16.463f, 2.6818f, 17.1448f, 4.0454f, 18.5083f)
                lineTo(5.4917f, 19.9546f)
                curveTo(6.8552f, 21.3182f, 7.537f, 22.0f, 8.3843f, 22.0f)
                curveTo(9.2315f, 22.0f, 9.9133f, 21.3182f, 11.2769f, 19.9546f)
                lineTo(19.9546f, 11.2769f)
                curveTo(21.3182f, 9.9133f, 22.0f, 9.2315f, 22.0f, 8.3843f)
                curveTo(22.0f, 7.537f, 21.3182f, 6.8552f, 19.9546f, 5.4917f)
                lineTo(18.5083f, 4.0454f)
                curveTo(17.1448f, 2.6818f, 16.463f, 2.0f, 15.6157f, 2.0f)
                curveTo(14.8623f, 2.0f, 14.2396f, 2.5393f, 13.1519f, 3.6178f)
                lineTo(12.1026f, 4.6659f)
                lineTo(11.0299f, 5.7386f)
                lineTo(9.9812f, 6.7873f)
                lineTo(8.9086f, 7.8599f)
                lineTo(7.8599f, 8.9086f)
                lineTo(6.7873f, 9.9812f)
                lineTo(5.7386f, 11.0299f)
                lineTo(4.6659f, 12.1026f)
                lineTo(3.6178f, 13.1519f)
                curveTo(2.5393f, 14.2396f, 2.0f, 14.8623f, 2.0f, 15.6157f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.2377f, 3.6912f)
                curveTo(13.2107f, 3.6642f, 13.1821f, 3.6397f, 13.1523f, 3.6177f)
                lineTo(12.103f, 4.6658f)
                curveTo(12.1251f, 4.6959f, 12.1498f, 4.7247f, 12.177f, 4.7519f)
                lineTo(13.5912f, 6.1661f)
                curveTo(13.8841f, 6.459f, 14.359f, 6.459f, 14.6519f, 6.1661f)
                curveTo(14.9448f, 5.8732f, 14.9448f, 5.3983f, 14.6519f, 5.1055f)
                lineTo(13.2377f, 3.6912f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.1164f, 5.8126f)
                curveTo(11.0891f, 5.7853f, 11.0604f, 5.7607f, 11.0303f, 5.7385f)
                lineTo(9.9816f, 6.7872f)
                curveTo(10.0038f, 6.8172f, 10.0285f, 6.846f, 10.0557f, 6.8732f)
                lineTo(12.177f, 8.9945f)
                curveTo(12.4699f, 9.2874f, 12.9448f, 9.2874f, 13.2377f, 8.9945f)
                curveTo(13.5306f, 8.7016f, 13.5306f, 8.2268f, 13.2377f, 7.9339f)
                lineTo(11.1164f, 5.8126f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.995f, 7.9339f)
                curveTo(8.9678f, 7.9067f, 8.939f, 7.882f, 8.909f, 7.8598f)
                lineTo(7.8603f, 8.9085f)
                curveTo(7.8825f, 8.9385f, 7.9072f, 8.9673f, 7.9344f, 8.9945f)
                lineTo(9.3486f, 10.4088f)
                curveTo(9.6415f, 10.7017f, 10.1164f, 10.7017f, 10.4092f, 10.4088f)
                curveTo(10.7021f, 10.1159f, 10.7021f, 9.641f, 10.4092f, 9.3481f)
                lineTo(8.995f, 7.9339f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.8737f, 10.0552f)
                curveTo(6.8465f, 10.028f, 6.8177f, 10.0033f, 6.7877f, 9.9811f)
                lineTo(5.739f, 11.0298f)
                curveTo(5.7611f, 11.0599f, 5.7858f, 11.0886f, 5.813f, 11.1159f)
                lineTo(7.9344f, 13.2372f)
                curveTo(8.2273f, 13.5301f, 8.7021f, 13.5301f, 8.995f, 13.2372f)
                curveTo(9.2879f, 12.9443f, 9.2879f, 12.4694f, 8.995f, 12.1765f)
                lineTo(6.8737f, 10.0552f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.7524f, 12.1765f)
                curveTo(4.7252f, 12.1493f, 4.6964f, 12.1246f, 4.6663f, 12.1025f)
                lineTo(3.6182f, 13.1518f)
                curveTo(3.6402f, 13.1816f, 3.6647f, 13.2102f, 3.6917f, 13.2372f)
                lineTo(5.1059f, 14.6514f)
                curveTo(5.3988f, 14.9443f, 5.8737f, 14.9443f, 6.1666f, 14.6514f)
                curveTo(6.4595f, 14.3585f, 6.4595f, 13.8836f, 6.1666f, 13.5907f)
                lineTo(4.7524f, 12.1765f)
                close()
            }
        }
            .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
