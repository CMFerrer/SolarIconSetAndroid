package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(
            name = "Incognito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.3879f, 3.25f)
                horizontalLineTo(13.6121f)
                curveTo(14.6973f, 3.25f, 15.5784f, 3.25f, 16.2872f, 3.3347f)
                curveTo(17.0262f, 3.4231f, 17.6608f, 3.6112f, 18.2155f, 4.0442f)
                curveTo(18.7701f, 4.4773f, 19.1065f, 5.0473f, 19.3715f, 5.7428f)
                curveTo(19.6256f, 6.4099f, 19.8393f, 7.2647f, 20.1025f, 8.3175f)
                lineTo(20.5856f, 10.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 10.25f, 22.75f, 10.5858f, 22.75f, 11.0f)
                curveTo(22.75f, 11.4142f, 22.4142f, 11.75f, 22.0f, 11.75f)
                horizontalLineTo(20.0157f)
                curveTo(20.0048f, 11.7502f, 19.994f, 11.7502f, 19.9832f, 11.75f)
                horizontalLineTo(4.0168f)
                curveTo(4.006f, 11.7502f, 3.9952f, 11.7502f, 3.9843f, 11.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 11.75f, 1.25f, 11.4142f, 1.25f, 11.0f)
                curveTo(1.25f, 10.5858f, 1.5858f, 10.25f, 2.0f, 10.25f)
                horizontalLineTo(3.4144f)
                lineTo(3.8975f, 8.3175f)
                curveTo(4.1607f, 7.2647f, 4.3744f, 6.4099f, 4.6285f, 5.7428f)
                curveTo(4.8935f, 5.0473f, 5.2299f, 4.4773f, 5.7845f, 4.0442f)
                curveTo(6.3391f, 3.6112f, 6.9738f, 3.4231f, 7.7128f, 3.3347f)
                curveTo(8.4216f, 3.25f, 9.3027f, 3.25f, 10.3879f, 3.25f)
                close()
                moveTo(4.9606f, 10.25f)
                horizontalLineTo(19.0394f)
                lineTo(18.6586f, 8.7267f)
                curveTo(18.3813f, 7.6176f, 18.1882f, 6.8504f, 17.9697f, 6.2769f)
                curveTo(17.7584f, 5.7222f, 17.5515f, 5.4289f, 17.2923f, 5.2265f)
                curveTo(17.0332f, 5.0242f, 16.6985f, 4.8946f, 16.1091f, 4.8241f)
                curveTo(15.4997f, 4.7512f, 14.7085f, 4.75f, 13.5653f, 4.75f)
                horizontalLineTo(10.4347f)
                curveTo(9.2915f, 4.75f, 8.5003f, 4.7512f, 7.8909f, 4.8241f)
                curveTo(7.3015f, 4.8946f, 6.9668f, 5.0242f, 6.7077f, 5.2265f)
                curveTo(6.4485f, 5.4289f, 6.2416f, 5.7222f, 6.0303f, 6.2769f)
                curveTo(5.8118f, 6.8504f, 5.6187f, 7.6176f, 5.3414f, 8.7267f)
                lineTo(4.9606f, 10.25f)
                close()
                moveTo(6.5f, 14.75f)
                curveTo(4.9812f, 14.75f, 3.75f, 15.9812f, 3.75f, 17.5f)
                curveTo(3.75f, 19.0188f, 4.9812f, 20.25f, 6.5f, 20.25f)
                curveTo(8.0188f, 20.25f, 9.25f, 19.0188f, 9.25f, 17.5f)
                curveTo(9.25f, 15.9812f, 8.0188f, 14.75f, 6.5f, 14.75f)
                close()
                moveTo(2.25f, 17.5f)
                curveTo(2.25f, 15.1528f, 4.1528f, 13.25f, 6.5f, 13.25f)
                curveTo(8.4579f, 13.25f, 10.1066f, 14.5739f, 10.5996f, 16.3754f)
                curveTo(11.4979f, 16.0137f, 12.5021f, 16.0137f, 13.4004f, 16.3754f)
                curveTo(13.8934f, 14.5739f, 15.5421f, 13.25f, 17.5f, 13.25f)
                curveTo(19.8472f, 13.25f, 21.75f, 15.1528f, 21.75f, 17.5f)
                curveTo(21.75f, 19.8472f, 19.8472f, 21.75f, 17.5f, 21.75f)
                curveTo(15.314f, 21.75f, 13.5134f, 20.0995f, 13.2764f, 17.9767f)
                lineTo(13.0062f, 17.8416f)
                curveTo(12.3728f, 17.5249f, 11.6272f, 17.5249f, 10.9938f, 17.8416f)
                lineTo(10.7236f, 17.9767f)
                curveTo(10.4866f, 20.0995f, 8.686f, 21.75f, 6.5f, 21.75f)
                curveTo(4.1528f, 21.75f, 2.25f, 19.8472f, 2.25f, 17.5f)
                close()
                moveTo(17.5f, 14.75f)
                curveTo(15.9812f, 14.75f, 14.75f, 15.9812f, 14.75f, 17.5f)
                curveTo(14.75f, 19.0188f, 15.9812f, 20.25f, 17.5f, 20.25f)
                curveTo(19.0188f, 20.25f, 20.25f, 19.0188f, 20.25f, 17.5f)
                curveTo(20.25f, 15.9812f, 19.0188f, 14.75f, 17.5f, 14.75f)
                close()
            }
        }
            .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
