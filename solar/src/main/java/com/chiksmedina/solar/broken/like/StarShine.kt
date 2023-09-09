package com.chiksmedina.solar.broken.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.LikeGroup

public val LikeGroup.StarShine: ImageVector
    get() {
        if (_starShine != null) {
            return _starShine!!
        }
        _starShine = Builder(name = "StarShine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                lineTo(4.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                lineTo(6.3431f, 17.657f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.6567f, 6.3428f)
                lineTo(18.0f, 5.9995f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                lineTo(17.657f, 17.657f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.3433f, 6.3438f)
                lineTo(6.0f, 6.0005f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2653f, 14.6272f)
                curveTo(15.3921f, 15.9353f, 15.4554f, 16.5894f, 15.0724f, 16.8801f)
                curveTo(14.6894f, 17.1709f, 14.1137f, 16.9058f, 12.9622f, 16.3756f)
                lineTo(12.6643f, 16.2384f)
                curveTo(12.337f, 16.0878f, 12.1734f, 16.0124f, 12.0f, 16.0124f)
                curveTo(11.8266f, 16.0124f, 11.663f, 16.0878f, 11.3357f, 16.2384f)
                lineTo(11.0378f, 16.3756f)
                curveTo(9.8863f, 16.9058f, 9.3106f, 17.1709f, 8.9276f, 16.8801f)
                curveTo(8.5446f, 16.5894f, 8.6079f, 15.9353f, 8.7347f, 14.6272f)
                lineTo(8.7675f, 14.2888f)
                curveTo(8.8035f, 13.9171f, 8.8215f, 13.7312f, 8.7679f, 13.5589f)
                curveTo(8.7143f, 13.3865f, 8.5952f, 13.2472f, 8.357f, 12.9686f)
                lineTo(8.14f, 12.715f)
                curveTo(7.3016f, 11.7345f, 6.8824f, 11.2443f, 7.0287f, 10.7739f)
                curveTo(7.1347f, 10.4331f, 7.4866f, 10.2661f, 8.14f, 10.0942f)
                moveTo(10.5766f, 8.7042f)
                curveTo(11.2099f, 7.5681f, 11.5266f, 7.0f, 12.0f, 7.0f)
                curveTo(12.4734f, 7.0f, 12.7901f, 7.5681f, 13.4234f, 8.7042f)
                lineTo(13.5873f, 8.9981f)
                curveTo(13.7672f, 9.321f, 13.8572f, 9.4824f, 13.9975f, 9.5889f)
                curveTo(14.1378f, 9.6954f, 14.3126f, 9.735f, 14.6621f, 9.814f)
                lineTo(14.9802f, 9.886f)
                curveTo(16.2101f, 10.1643f, 16.825f, 10.3034f, 16.9713f, 10.7739f)
                curveTo(17.0769f, 11.1134f, 16.8879f, 11.4631f, 16.4595f, 12.0f)
            }
        }
        .build()
        return _starShine!!
    }

private var _starShine: ImageVector? = null
