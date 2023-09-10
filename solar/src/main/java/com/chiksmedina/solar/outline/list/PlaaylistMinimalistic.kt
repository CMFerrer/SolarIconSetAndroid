package com.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ListGroup

val ListGroup.PlaaylistMinimalistic: ImageVector
    get() {
        if (_plaaylistMinimalistic != null) {
            return _plaaylistMinimalistic!!
        }
        _plaaylistMinimalistic = Builder(
            name = "PlaaylistMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 5.25f, 20.75f, 5.5858f, 20.75f, 6.0f)
                curveTo(20.75f, 6.4142f, 20.4142f, 6.75f, 20.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(19.4656f, 10.016f)
                lineTo(19.5344f, 10.0557f)
                curveTo(20.3262f, 10.5129f, 20.9675f, 10.8831f, 21.4397f, 11.2194f)
                curveTo(21.9157f, 11.5583f, 22.3284f, 11.9351f, 22.5407f, 12.4476f)
                curveTo(22.8198f, 13.1214f, 22.8198f, 13.8786f, 22.5407f, 14.5524f)
                curveTo(22.3284f, 15.0649f, 21.9157f, 15.4417f, 21.4397f, 15.7806f)
                curveTo(20.9675f, 16.1169f, 20.3262f, 16.4871f, 19.5344f, 16.9443f)
                lineTo(19.4656f, 16.9839f)
                curveTo(18.6738f, 17.4411f, 18.0326f, 17.8114f, 17.5052f, 18.0522f)
                curveTo(16.9737f, 18.295f, 16.4411f, 18.464f, 15.8911f, 18.3915f)
                curveTo(15.1679f, 18.2963f, 14.5123f, 17.9178f, 14.0683f, 17.3392f)
                curveTo(13.7305f, 16.899f, 13.6106f, 16.3533f, 13.5551f, 15.7716f)
                curveTo(13.5f, 15.1945f, 13.5f, 14.454f, 13.5f, 13.5397f)
                verticalLineTo(13.4603f)
                curveTo(13.5f, 12.546f, 13.5f, 11.8055f, 13.5551f, 11.2284f)
                curveTo(13.6106f, 10.6467f, 13.7305f, 10.101f, 14.0683f, 9.6608f)
                curveTo(14.5123f, 9.0822f, 15.1679f, 8.7037f, 15.8911f, 8.6085f)
                curveTo(16.4411f, 8.536f, 16.9737f, 8.705f, 17.5052f, 8.9478f)
                curveTo(18.0326f, 9.1886f, 18.6738f, 9.5589f, 19.4656f, 10.016f)
                close()
                moveTo(16.8821f, 10.3122f)
                curveTo(16.4243f, 10.1031f, 16.2099f, 10.0794f, 16.0868f, 10.0956f)
                curveTo(15.7582f, 10.1389f, 15.4601f, 10.311f, 15.2583f, 10.574f)
                curveTo(15.1828f, 10.6724f, 15.0961f, 10.87f, 15.0483f, 11.3709f)
                curveTo(15.0008f, 11.8682f, 15.0f, 12.5366f, 15.0f, 13.5f)
                curveTo(15.0f, 14.4634f, 15.0008f, 15.1318f, 15.0483f, 15.6291f)
                curveTo(15.0961f, 16.13f, 15.1828f, 16.3276f, 15.2583f, 16.426f)
                curveTo(15.4601f, 16.689f, 15.7582f, 16.8611f, 16.0868f, 16.9044f)
                curveTo(16.2099f, 16.9206f, 16.4243f, 16.8969f, 16.8821f, 16.6878f)
                curveTo(17.3364f, 16.4803f, 17.9157f, 16.1468f, 18.75f, 15.6651f)
                curveTo(19.5843f, 15.1834f, 20.1628f, 14.8484f, 20.5697f, 14.5587f)
                curveTo(20.9796f, 14.2669f, 21.1074f, 14.093f, 21.1549f, 13.9784f)
                curveTo(21.2817f, 13.6721f, 21.2817f, 13.3279f, 21.1549f, 13.0216f)
                curveTo(21.1074f, 12.907f, 20.9796f, 12.7331f, 20.5697f, 12.4413f)
                curveTo(20.1628f, 12.1516f, 19.5843f, 11.8166f, 18.75f, 11.3349f)
                curveTo(17.9157f, 10.8532f, 17.3364f, 10.5197f, 16.8821f, 10.3122f)
                close()
                moveTo(2.25f, 11.0f)
                curveTo(2.25f, 10.5858f, 2.5858f, 10.25f, 3.0f, 10.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 10.25f, 10.75f, 10.5858f, 10.75f, 11.0f)
                curveTo(10.75f, 11.4142f, 10.4142f, 11.75f, 10.0f, 11.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 11.75f, 2.25f, 11.4142f, 2.25f, 11.0f)
                close()
                moveTo(2.25f, 16.0f)
                curveTo(2.25f, 15.5858f, 2.5858f, 15.25f, 3.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 16.75f, 2.25f, 16.4142f, 2.25f, 16.0f)
                close()
            }
        }
            .build()
        return _plaaylistMinimalistic!!
    }

private var _plaaylistMinimalistic: ImageVector? = null
