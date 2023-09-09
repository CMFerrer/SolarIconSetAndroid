package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.outline.ArrowsActionGroup

public val ArrowsActionGroup.UndoLeftSquare: ImageVector
    get() {
        if (_undoLeftSquare != null) {
            return _undoLeftSquare!!
        }
        _undoLeftSquare = Builder(name = "UndoLeftSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2587f, 7.9739f)
                curveTo(9.5631f, 7.693f, 9.5821f, 7.2185f, 9.3011f, 6.9141f)
                curveTo(9.0202f, 6.6098f, 8.5456f, 6.5908f, 8.2413f, 6.8717f)
                lineTo(5.9913f, 8.9487f)
                curveTo(5.8375f, 9.0906f, 5.75f, 9.2905f, 5.75f, 9.4998f)
                curveTo(5.75f, 9.7091f, 5.8375f, 9.9089f, 5.9913f, 10.0509f)
                lineTo(8.2413f, 12.1278f)
                curveTo(8.5456f, 12.4088f, 9.0202f, 12.3898f, 9.3011f, 12.0854f)
                curveTo(9.5821f, 11.781f, 9.5631f, 11.3065f, 9.2587f, 11.0256f)
                lineTo(8.4182f, 10.2498f)
                horizontalLineTo(14.0385f)
                curveTo(14.7376f, 10.2498f, 15.2069f, 10.2506f, 15.5652f, 10.2862f)
                curveTo(15.9116f, 10.3205f, 16.0724f, 10.3813f, 16.1787f, 10.4501f)
                curveTo(16.3272f, 10.5461f, 16.4537f, 10.6726f, 16.5497f, 10.8211f)
                curveTo(16.6184f, 10.9274f, 16.6793f, 11.0882f, 16.7136f, 11.4345f)
                curveTo(16.7491f, 11.7929f, 16.75f, 12.2622f, 16.75f, 12.9613f)
                curveTo(16.75f, 13.6604f, 16.7491f, 14.1298f, 16.7136f, 14.4881f)
                curveTo(16.6793f, 14.8344f, 16.6185f, 14.9952f, 16.5497f, 15.1015f)
                curveTo(16.4537f, 15.2501f, 16.3272f, 15.3765f, 16.1787f, 15.4726f)
                curveTo(16.0724f, 15.5413f, 15.9116f, 15.6021f, 15.5652f, 15.6365f)
                curveTo(15.2069f, 15.672f, 14.7376f, 15.6729f, 14.0385f, 15.6729f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 15.6729f, 8.75f, 16.0086f, 8.75f, 16.4229f)
                curveTo(8.75f, 16.8371f, 9.0858f, 17.1729f, 9.5f, 17.1729f)
                horizontalLineTo(14.0758f)
                curveTo(14.7279f, 17.1729f, 15.2721f, 17.1729f, 15.7133f, 17.1291f)
                curveTo(16.1748f, 17.0834f, 16.6038f, 16.9839f, 16.9931f, 16.7322f)
                curveTo(17.3199f, 16.5209f, 17.5981f, 16.2427f, 17.8094f, 15.916f)
                curveTo(18.0611f, 15.5266f, 18.1605f, 15.0976f, 18.2063f, 14.6361f)
                curveTo(18.25f, 14.195f, 18.25f, 13.6508f, 18.25f, 12.9987f)
                verticalLineTo(12.924f)
                curveTo(18.25f, 12.2718f, 18.25f, 11.7276f, 18.2063f, 11.2865f)
                curveTo(18.1605f, 10.825f, 18.0611f, 10.396f, 17.8093f, 10.0067f)
                curveTo(17.5981f, 9.6799f, 17.3199f, 9.4017f, 16.9931f, 9.1904f)
                curveTo(16.6038f, 8.9387f, 16.1748f, 8.8393f, 15.7133f, 8.7935f)
                curveTo(15.2721f, 8.7498f, 14.7279f, 8.7498f, 14.0758f, 8.7498f)
                lineTo(8.4182f, 8.7498f)
                lineTo(9.2587f, 7.9739f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9426f, 1.25f)
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
                horizontalLineTo(11.9426f)
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
        return _undoLeftSquare!!
    }

private var _undoLeftSquare: ImageVector? = null
