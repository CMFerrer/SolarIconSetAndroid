package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.MentionSquare: ImageVector
    get() {
        if (_mentionSquare != null) {
            return _mentionSquare!!
        }
        _mentionSquare = Builder(name = "MentionSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 9.1005f, 9.1005f, 6.75f, 12.0f, 6.75f)
                curveTo(14.8995f, 6.75f, 17.25f, 9.1005f, 17.25f, 12.0f)
                curveTo(17.25f, 12.6327f, 17.1384f, 13.2376f, 16.9345f, 13.7973f)
                curveTo(16.8991f, 13.8944f, 16.8295f, 13.9989f, 16.7183f, 14.1015f)
                lineTo(16.6377f, 14.1758f)
                curveTo(16.3369f, 14.4533f, 15.8853f, 14.4888f, 15.5448f, 14.2618f)
                curveTo(15.2981f, 14.0974f, 15.15f, 13.8206f, 15.15f, 13.5241f)
                verticalLineTo(12.0f)
                curveTo(15.15f, 10.2603f, 13.7397f, 8.85f, 12.0f, 8.85f)
                curveTo(10.2603f, 8.85f, 8.85f, 10.2603f, 8.85f, 12.0f)
                curveTo(8.85f, 13.7397f, 10.2603f, 15.15f, 12.0f, 15.15f)
                curveTo(12.7017f, 15.15f, 13.3499f, 14.9205f, 13.8735f, 14.5325f)
                curveTo(14.0557f, 14.9233f, 14.3431f, 15.2635f, 14.7127f, 15.5099f)
                curveTo(15.6294f, 16.121f, 16.8451f, 16.0252f, 17.6548f, 15.2783f)
                lineTo(17.7354f, 15.204f)
                curveTo(17.9855f, 14.9732f, 18.211f, 14.6756f, 18.3439f, 14.3108f)
                curveTo(18.6069f, 13.5889f, 18.75f, 12.8103f, 18.75f, 12.0f)
                curveTo(18.75f, 8.2721f, 15.7279f, 5.25f, 12.0f, 5.25f)
                curveTo(8.2721f, 5.25f, 5.25f, 8.2721f, 5.25f, 12.0f)
                curveTo(5.25f, 15.7279f, 8.2721f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                curveTo(12.75f, 17.5858f, 12.4142f, 17.25f, 12.0f, 17.25f)
                curveTo(9.1005f, 17.25f, 6.75f, 14.8995f, 6.75f, 12.0f)
                close()
                moveTo(12.0f, 10.35f)
                curveTo(12.9113f, 10.35f, 13.65f, 11.0887f, 13.65f, 12.0f)
                curveTo(13.65f, 12.9113f, 12.9113f, 13.65f, 12.0f, 13.65f)
                curveTo(11.0887f, 13.65f, 10.35f, 12.9113f, 10.35f, 12.0f)
                curveTo(10.35f, 11.0887f, 11.0887f, 10.35f, 12.0f, 10.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 9.6342f, 22.75f, 7.8252f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                close()
                moveTo(3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(14.3782f, 2.75f, 16.0864f, 2.7516f, 17.3864f, 2.9264f)
                curveTo(18.6648f, 3.0982f, 19.4355f, 3.4251f, 20.0052f, 3.9948f)
                curveTo(20.5749f, 4.5644f, 20.9018f, 5.3352f, 21.0736f, 6.6136f)
                curveTo(21.2484f, 7.9136f, 21.25f, 9.6218f, 21.25f, 12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(20.9018f, 18.6648f, 20.5749f, 19.4355f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                curveTo(2.75f, 9.6218f, 2.7516f, 7.9136f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                close()
            }
        }
        .build()
        return _mentionSquare!!
    }

private var _mentionSquare: ImageVector? = null
