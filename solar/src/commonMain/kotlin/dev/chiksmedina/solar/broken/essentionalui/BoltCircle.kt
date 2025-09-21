package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.BoltCircle: ImageVector
    get() {
        if (_boltCircle != null) {
            return _boltCircle!!
        }
        _boltCircle = Builder(
            name = "BoltCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.2126f, 10.1735f)
                lineTo(11.2277f, 8.5688f)
                curveTo(12.5302f, 7.5316f, 13.1814f, 7.013f, 13.5908f, 7.2691f)
                curveTo(14.0001f, 7.5253f, 13.7876f, 8.3185f, 13.3625f, 9.9048f)
                lineTo(13.3224f, 10.0544f)
                curveTo(13.1691f, 10.6266f, 13.0925f, 10.9126f, 13.2272f, 11.1411f)
                lineTo(13.2344f, 11.153f)
                curveTo(13.3741f, 11.3787f, 13.6718f, 11.4584f, 14.2673f, 11.618f)
                curveTo(15.339f, 11.9051f, 15.8748f, 12.0487f, 15.9688f, 12.4222f)
                curveTo(15.9704f, 12.4284f, 15.9718f, 12.4346f, 15.9732f, 12.4409f)
                curveTo(16.0557f, 12.8167f, 15.633f, 13.1533f, 14.7876f, 13.8266f)
                lineTo(12.7725f, 15.4312f)
                curveTo(11.47f, 16.4684f, 10.8187f, 16.9871f, 10.4094f, 16.7309f)
                curveTo(10.0f, 16.4748f, 10.2126f, 15.6816f, 10.6377f, 14.0952f)
                lineTo(10.6777f, 13.9457f)
                curveTo(10.8311f, 13.3735f, 10.9077f, 13.0874f, 10.773f, 12.859f)
                lineTo(10.7658f, 12.8471f)
                curveTo(10.6261f, 12.6214f, 10.3283f, 12.5416f, 9.7328f, 12.3821f)
                curveTo(8.6612f, 12.0949f, 8.1254f, 11.9514f, 8.0314f, 11.5778f)
                curveTo(8.0298f, 11.5716f, 8.0284f, 11.5654f, 8.027f, 11.5592f)
                curveTo(7.9445f, 11.1834f, 8.3672f, 10.8468f, 9.2126f, 10.1735f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 3.3378f)
                curveTo(8.4709f, 2.487f, 10.1786f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 10.1786f, 2.487f, 8.4709f, 3.3378f, 7.0f)
            }
        }
            .build()
        return _boltCircle!!
    }

private var _boltCircle: ImageVector? = null
