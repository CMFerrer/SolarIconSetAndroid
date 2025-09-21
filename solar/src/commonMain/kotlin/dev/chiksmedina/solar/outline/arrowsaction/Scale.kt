package dev.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(
            name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0014f, 2.75f)
                curveTo(11.4156f, 2.7492f, 11.7507f, 2.4129f, 11.75f, 1.9986f)
                curveTo(11.7493f, 1.5844f, 11.4129f, 1.2493f, 10.9986f, 1.25f)
                curveTo(8.9835f, 1.2536f, 7.3774f, 1.2788f, 6.1006f, 1.4854f)
                curveTo(4.8019f, 1.6956f, 3.7626f, 2.1051f, 2.9341f, 2.9336f)
                curveTo(2.0393f, 3.8284f, 1.634f, 4.9684f, 1.4397f, 6.4131f)
                curveTo(1.25f, 7.8246f, 1.25f, 9.6336f, 1.25f, 11.942f)
                verticalLineTo(12.0568f)
                curveTo(1.25f, 14.3652f, 1.25f, 16.1742f, 1.4397f, 17.5857f)
                curveTo(1.634f, 19.0305f, 2.0393f, 20.1705f, 2.9341f, 21.0653f)
                curveTo(3.8289f, 21.9601f, 4.969f, 22.3654f, 6.4137f, 22.5597f)
                curveTo(7.8252f, 22.7494f, 9.6342f, 22.7494f, 11.9426f, 22.7494f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.7494f, 16.1748f, 22.7494f, 17.5863f, 22.5597f)
                curveTo(19.031f, 22.3654f, 20.1711f, 21.9601f, 21.0659f, 21.0653f)
                curveTo(21.8943f, 20.2369f, 22.3038f, 19.1975f, 22.514f, 17.8988f)
                curveTo(22.7207f, 16.622f, 22.7458f, 15.0159f, 22.7494f, 13.0008f)
                curveTo(22.7502f, 12.5866f, 22.415f, 12.2502f, 22.0008f, 12.2494f)
                curveTo(21.5866f, 12.2487f, 21.2502f, 12.5839f, 21.2494f, 12.9981f)
                curveTo(21.2457f, 15.038f, 21.2175f, 16.5212f, 21.0333f, 17.6591f)
                curveTo(20.8526f, 18.7752f, 20.5338f, 19.476f, 20.0052f, 20.0046f)
                curveTo(19.4355f, 20.5743f, 18.6648f, 20.9012f, 17.3864f, 21.0731f)
                curveTo(16.0864f, 21.2478f, 14.3782f, 21.2494f, 12.0f, 21.2494f)
                curveTo(9.6218f, 21.2494f, 7.9136f, 21.2478f, 6.6136f, 21.0731f)
                curveTo(5.3352f, 20.9012f, 4.5644f, 20.5743f, 3.9948f, 20.0046f)
                curveTo(3.4251f, 19.435f, 3.0982f, 18.6643f, 2.9264f, 17.3858f)
                curveTo(2.7516f, 16.0859f, 2.75f, 14.3776f, 2.75f, 11.9994f)
                curveTo(2.75f, 9.6212f, 2.7516f, 7.913f, 2.9264f, 6.613f)
                curveTo(3.0982f, 5.3346f, 3.4251f, 4.5639f, 3.9948f, 3.9942f)
                curveTo(4.5234f, 3.4656f, 5.2243f, 3.1468f, 6.3403f, 2.9662f)
                curveTo(7.4783f, 2.782f, 8.9614f, 2.7537f, 11.0014f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.9062f, 2.0f)
                curveTo(15.9062f, 2.4142f, 16.242f, 2.75f, 16.6562f, 2.75f)
                horizontalLineTo(20.1893f)
                lineTo(12.75f, 10.1893f)
                verticalLineTo(8.0f)
                curveTo(12.75f, 7.5858f, 12.4142f, 7.25f, 12.0f, 7.25f)
                curveTo(11.5858f, 7.25f, 11.25f, 7.5858f, 11.25f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12.0f, 12.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12.0f)
                curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(13.8107f)
                lineTo(21.25f, 3.8107f)
                verticalLineTo(7.3438f)
                curveTo(21.25f, 7.758f, 21.5858f, 8.0938f, 22.0f, 8.0938f)
                curveTo(22.4142f, 8.0938f, 22.75f, 7.758f, 22.75f, 7.3438f)
                verticalLineTo(2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(16.6562f)
                curveTo(16.242f, 1.25f, 15.9062f, 1.5858f, 15.9062f, 2.0f)
                close()
            }
        }
            .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
