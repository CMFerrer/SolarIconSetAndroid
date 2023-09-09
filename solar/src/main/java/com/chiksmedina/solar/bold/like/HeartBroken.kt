package com.chiksmedina.solar.bold.like

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
import com.chiksmedina.solar.bold.LikeGroup

public val LikeGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1063f, 18.2471f)
                curveTo(5.2982f, 16.0836f, 2.0f, 13.5424f, 2.0f, 9.1373f)
                curveTo(2.0f, 4.5368f, 6.9226f, 1.202f, 11.2639f, 4.814f)
                lineTo(9.8106f, 8.2049f)
                curveTo(9.6718f, 8.5289f, 9.7773f, 8.9058f, 10.0641f, 9.1106f)
                lineTo(12.8973f, 11.1344f)
                lineTo(10.4306f, 14.0123f)
                curveTo(10.1755f, 14.3098f, 10.1926f, 14.7536f, 10.4697f, 15.0307f)
                lineTo(12.1694f, 16.7304f)
                lineTo(11.2594f, 20.3704f)
                curveTo(10.5043f, 20.1171f, 9.7439f, 19.5277f, 8.9617f, 18.9111f)
                curveTo(8.6847f, 18.6927f, 8.3981f, 18.4719f, 8.1063f, 18.2471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8118f, 20.3456f)
                curveTo(13.5435f, 20.0801f, 14.2807f, 19.5083f, 15.0383f, 18.9111f)
                curveTo(15.3153f, 18.6927f, 15.6019f, 18.4719f, 15.8937f, 18.2471f)
                curveTo(18.7018f, 16.0835f, 22.0f, 13.5424f, 22.0f, 9.1373f)
                curveTo(22.0f, 4.6225f, 17.259f, 1.3266f, 12.9792f, 4.6194f)
                lineTo(11.4272f, 8.2409f)
                lineTo(14.4359f, 10.39f)
                curveTo(14.6072f, 10.5124f, 14.7191f, 10.701f, 14.7445f, 10.9098f)
                curveTo(14.7699f, 11.1187f, 14.7064f, 11.3287f, 14.5694f, 11.4884f)
                lineTo(12.0214f, 14.4611f)
                lineTo(13.5303f, 15.97f)
                curveTo(13.7166f, 16.1563f, 13.7915f, 16.4267f, 13.7276f, 16.6822f)
                lineTo(12.8118f, 20.3456f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
