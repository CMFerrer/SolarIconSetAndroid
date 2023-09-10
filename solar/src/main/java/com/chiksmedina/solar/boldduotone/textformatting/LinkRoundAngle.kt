package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.LinkRoundAngle: ImageVector
    get() {
        if (_linkRoundAngle != null) {
            return _linkRoundAngle!!
        }
        _linkRoundAngle = Builder(
            name = "LinkRoundAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.2773f, 7.9344f)
                curveTo(-0.3587f, 10.5704f, -0.3587f, 14.8443f, 2.2773f, 17.4803f)
                curveTo(3.4994f, 18.7024f, 5.0754f, 19.3583f, 6.6749f, 19.4469f)
                curveTo(7.0885f, 19.4699f, 7.4423f, 19.1532f, 7.4652f, 18.7396f)
                curveTo(7.4882f, 18.326f, 7.1715f, 17.9722f, 6.7579f, 17.9492f)
                curveTo(5.5126f, 17.8803f, 4.2891f, 17.3708f, 3.338f, 16.4196f)
                curveTo(1.2877f, 14.3694f, 1.2877f, 11.0453f, 3.338f, 8.995f)
                lineTo(6.1664f, 6.1666f)
                curveTo(8.2167f, 4.1163f, 11.5408f, 4.1163f, 13.591f, 6.1666f)
                curveTo(15.6413f, 8.2169f, 15.6413f, 11.541f, 13.591f, 13.5912f)
                lineTo(12.1768f, 15.0054f)
                curveTo(11.8839f, 15.2983f, 11.8839f, 15.7732f, 12.1768f, 16.0661f)
                curveTo(12.4697f, 16.359f, 12.9446f, 16.359f, 13.2375f, 16.0661f)
                lineTo(14.6517f, 14.6519f)
                curveTo(17.2877f, 12.0158f, 17.2877f, 7.742f, 14.6517f, 5.1059f)
                curveTo(12.0157f, 2.4699f, 7.7418f, 2.4699f, 5.1058f, 5.1059f)
                lineTo(2.2773f, 7.9344f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.409f, 17.8338f)
                curveTo(8.3588f, 15.7835f, 8.3588f, 12.4594f, 10.409f, 10.4091f)
                lineTo(11.8232f, 8.9949f)
                curveTo(12.1161f, 8.702f, 12.1161f, 8.2272f, 11.8232f, 7.9343f)
                curveTo(11.5303f, 7.6414f, 11.0555f, 7.6414f, 10.7626f, 7.9343f)
                lineTo(9.3484f, 9.3485f)
                curveTo(6.7123f, 11.9845f, 6.7123f, 16.2584f, 9.3484f, 18.8944f)
                curveTo(11.9844f, 21.5305f, 16.2583f, 21.5305f, 18.8943f, 18.8944f)
                lineTo(21.7227f, 16.066f)
                curveTo(24.3588f, 13.43f, 24.3588f, 9.1561f, 21.7227f, 6.5201f)
                curveTo(20.5006f, 5.2979f, 18.9247f, 4.642f, 17.3252f, 4.5534f)
                curveTo(16.9116f, 4.5305f, 16.5577f, 4.8472f, 16.5348f, 5.2608f)
                curveTo(16.5119f, 5.6744f, 16.8286f, 6.0282f, 17.2422f, 6.0511f)
                curveTo(18.4875f, 6.1201f, 19.7109f, 6.6296f, 20.6621f, 7.5807f)
                curveTo(22.7123f, 9.631f, 22.7123f, 12.9551f, 20.6621f, 15.0053f)
                lineTo(17.8336f, 17.8338f)
                curveTo(15.7834f, 19.884f, 12.4593f, 19.884f, 10.409f, 17.8338f)
                close()
            }
        }
            .build()
        return _linkRoundAngle!!
    }

private var _linkRoundAngle: ImageVector? = null
