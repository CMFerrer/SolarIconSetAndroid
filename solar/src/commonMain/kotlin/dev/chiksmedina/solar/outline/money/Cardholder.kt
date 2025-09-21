package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Cardholder: ImageVector
    get() {
        if (_cardholder != null) {
            return _cardholder!!
        }
        _cardholder = Builder(
            name = "Cardholder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(10.948f, 5.25f)
                horizontalLineTo(13.052f)
                curveTo(13.9505f, 5.25f, 14.6997f, 5.2499f, 15.2945f, 5.3299f)
                curveTo(15.9223f, 5.4143f, 16.4891f, 5.6f, 16.9445f, 6.0555f)
                curveTo(17.4f, 6.5109f, 17.5857f, 7.0777f, 17.6701f, 7.7055f)
                curveTo(17.7501f, 8.3003f, 17.75f, 9.0495f, 17.75f, 9.948f)
                lineTo(17.75f, 10.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 10.25f, 19.75f, 10.5858f, 19.75f, 11.0f)
                curveTo(19.75f, 11.4142f, 19.4142f, 11.75f, 19.0f, 11.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 11.75f, 4.25f, 11.4142f, 4.25f, 11.0f)
                curveTo(4.25f, 10.5858f, 4.5858f, 10.25f, 5.0f, 10.25f)
                horizontalLineTo(6.25f)
                lineTo(6.25f, 9.948f)
                curveTo(6.25f, 9.0495f, 6.2499f, 8.3003f, 6.3299f, 7.7055f)
                curveTo(6.4143f, 7.0777f, 6.6f, 6.5109f, 7.0555f, 6.0555f)
                curveTo(7.5109f, 5.6f, 8.0777f, 5.4143f, 8.7055f, 5.3299f)
                curveTo(9.3003f, 5.2499f, 10.0495f, 5.25f, 10.948f, 5.25f)
                close()
                moveTo(7.75f, 10.25f)
                horizontalLineTo(16.25f)
                verticalLineTo(10.0f)
                curveTo(16.25f, 9.036f, 16.2484f, 8.3884f, 16.1835f, 7.9054f)
                curveTo(16.1214f, 7.4439f, 16.0142f, 7.2464f, 15.8839f, 7.1161f)
                curveTo(15.7536f, 6.9858f, 15.5561f, 6.8786f, 15.0946f, 6.8165f)
                curveTo(14.6116f, 6.7516f, 13.964f, 6.75f, 13.0f, 6.75f)
                horizontalLineTo(11.0f)
                curveTo(10.036f, 6.75f, 9.3884f, 6.7516f, 8.9054f, 6.8165f)
                curveTo(8.4439f, 6.8786f, 8.2464f, 6.9858f, 8.1161f, 7.1161f)
                curveTo(7.9858f, 7.2464f, 7.8786f, 7.4439f, 7.8165f, 7.9054f)
                curveTo(7.7516f, 8.3884f, 7.75f, 9.036f, 7.75f, 10.0f)
                verticalLineTo(10.25f)
                close()
                moveTo(7.25f, 16.0f)
                curveTo(7.25f, 15.5858f, 7.5858f, 15.25f, 8.0f, 15.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 15.25f, 16.75f, 15.5858f, 16.75f, 16.0f)
                curveTo(16.75f, 16.4142f, 16.4142f, 16.75f, 16.0f, 16.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 16.75f, 7.25f, 16.4142f, 7.25f, 16.0f)
                close()
            }
        }
            .build()
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
