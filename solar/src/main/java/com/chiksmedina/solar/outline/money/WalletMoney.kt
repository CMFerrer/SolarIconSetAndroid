package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.outline.MoneyGroup

public val MoneyGroup.WalletMoney: ImageVector
    get() {
        if (_walletMoney != null) {
            return _walletMoney!!
        }
        _walletMoney = Builder(name = "WalletMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.9235f, 11.7502f)
                curveTo(20.9032f, 11.75f, 20.8766f, 11.75f, 20.8333f, 11.75f)
                horizontalLineTo(18.2308f)
                curveTo(16.8074f, 11.75f, 15.75f, 12.8087f, 15.75f, 14.0f)
                curveTo(15.75f, 15.1913f, 16.8074f, 16.25f, 18.2308f, 16.25f)
                horizontalLineTo(20.8333f)
                curveTo(20.8766f, 16.25f, 20.9032f, 16.25f, 20.9235f, 16.2498f)
                curveTo(20.9427f, 16.2496f, 20.948f, 16.2492f, 20.948f, 16.2492f)
                curveTo(21.154f, 16.2367f, 21.2427f, 16.0976f, 21.2495f, 16.0139f)
                curveTo(21.2495f, 16.0139f, 21.2497f, 16.0077f, 21.2498f, 15.9986f)
                curveTo(21.25f, 15.9808f, 21.25f, 15.9572f, 21.25f, 15.9167f)
                verticalLineTo(12.0833f)
                curveTo(21.25f, 12.0609f, 21.25f, 12.0437f, 21.25f, 12.0297f)
                curveTo(21.2499f, 12.0185f, 21.2499f, 12.0093f, 21.2498f, 12.0014f)
                curveTo(21.2497f, 11.9924f, 21.2495f, 11.9861f, 21.2495f, 11.9861f)
                curveTo(21.2427f, 11.9024f, 21.154f, 11.7633f, 20.9479f, 11.7508f)
                curveTo(20.9479f, 11.7508f, 20.943f, 11.7504f, 20.9235f, 11.7502f)
                close()
                moveTo(20.8499f, 10.25f)
                curveTo(20.9163f, 10.25f, 20.9803f, 10.2499f, 21.0391f, 10.2535f)
                curveTo(21.9104f, 10.3066f, 22.681f, 10.9638f, 22.7458f, 11.8818f)
                curveTo(22.7501f, 11.942f, 22.75f, 12.0069f, 22.75f, 12.067f)
                curveTo(22.75f, 12.0725f, 22.75f, 12.0779f, 22.75f, 12.0833f)
                verticalLineTo(15.9167f)
                curveTo(22.75f, 15.9221f, 22.75f, 15.9275f, 22.75f, 15.933f)
                curveTo(22.75f, 15.9931f, 22.7501f, 16.058f, 22.7458f, 16.1182f)
                curveTo(22.681f, 17.0362f, 21.9104f, 17.6934f, 21.0391f, 17.7465f)
                curveTo(20.9803f, 17.7501f, 20.9163f, 17.75f, 20.8499f, 17.75f)
                curveTo(20.8444f, 17.75f, 20.8389f, 17.75f, 20.8333f, 17.75f)
                horizontalLineTo(18.2308f)
                curveTo(16.0856f, 17.75f, 14.25f, 16.1224f, 14.25f, 14.0f)
                curveTo(14.25f, 11.8776f, 16.0856f, 10.25f, 18.2308f, 10.25f)
                horizontalLineTo(20.8333f)
                curveTo(20.8389f, 10.25f, 20.8444f, 10.25f, 20.8499f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                curveTo(19.0f, 14.5523f, 18.5523f, 15.0f, 18.0f, 15.0f)
                curveTo(17.4477f, 15.0f, 17.0f, 14.5523f, 17.0f, 14.0f)
                curveTo(17.0f, 13.4477f, 17.4477f, 13.0f, 18.0f, 13.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 13.4477f, 19.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.8499f, 10.25f)
                curveTo(20.9163f, 10.25f, 20.9803f, 10.2499f, 21.0391f, 10.2535f)
                curveTo(21.2645f, 10.2672f, 21.4832f, 10.3214f, 21.6847f, 10.4101f)
                curveTo(21.5777f, 8.8036f, 21.2831f, 7.5656f, 20.3588f, 6.6412f)
                curveTo(19.6104f, 5.8929f, 18.6614f, 5.5608f, 17.489f, 5.4031f)
                lineTo(17.4467f, 5.3975f)
                curveTo(17.4362f, 5.3898f, 17.4255f, 5.3822f, 17.4145f, 5.3749f)
                lineTo(13.679f, 2.8981f)
                curveTo(12.3758f, 2.034f, 10.6242f, 2.034f, 9.321f, 2.8981f)
                lineTo(5.5855f, 5.3749f)
                curveTo(5.5745f, 5.3822f, 5.5638f, 5.3898f, 5.5533f, 5.3975f)
                lineTo(5.511f, 5.4031f)
                curveTo(4.3386f, 5.5608f, 3.3896f, 5.8929f, 2.6412f, 6.6412f)
                curveTo(1.8929f, 7.3896f, 1.5608f, 8.3386f, 1.4031f, 9.511f)
                curveTo(1.25f, 10.6502f, 1.25f, 12.1058f, 1.25f, 13.9436f)
                verticalLineTo(14.0564f)
                curveTo(1.25f, 15.8942f, 1.25f, 17.3498f, 1.4031f, 18.489f)
                curveTo(1.5608f, 19.6614f, 1.8929f, 20.6104f, 2.6412f, 21.3588f)
                curveTo(3.3896f, 22.1071f, 4.3386f, 22.4392f, 5.511f, 22.5969f)
                curveTo(6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f, 22.75f)
                horizontalLineTo(13.0564f)
                curveTo(14.8942f, 22.75f, 16.3498f, 22.75f, 17.489f, 22.5969f)
                curveTo(18.6614f, 22.4392f, 19.6104f, 22.1071f, 20.3588f, 21.3588f)
                curveTo(21.2831f, 20.4344f, 21.5777f, 19.1964f, 21.6847f, 17.5899f)
                curveTo(21.4832f, 17.6786f, 21.2645f, 17.7328f, 21.0391f, 17.7465f)
                curveTo(20.9803f, 17.7501f, 20.9163f, 17.75f, 20.8499f, 17.75f)
                lineTo(20.8333f, 17.75f)
                horizontalLineTo(20.1679f)
                curveTo(20.0541f, 19.0915f, 19.7966f, 19.7996f, 19.2981f, 20.2981f)
                curveTo(18.8749f, 20.7213f, 18.2952f, 20.975f, 17.2892f, 21.1102f)
                curveTo(16.2615f, 21.2484f, 14.9068f, 21.25f, 13.0f, 21.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 21.25f, 6.7385f, 21.2484f, 5.7108f, 21.1102f)
                curveTo(4.7048f, 20.975f, 4.1251f, 20.7213f, 3.7019f, 20.2981f)
                curveTo(3.2787f, 19.8749f, 3.025f, 19.2952f, 2.8898f, 18.2892f)
                curveTo(2.7516f, 17.2615f, 2.75f, 15.9068f, 2.75f, 14.0f)
                curveTo(2.75f, 12.0932f, 2.7516f, 10.7385f, 2.8898f, 9.7108f)
                curveTo(3.025f, 8.7048f, 3.2787f, 8.1251f, 3.7019f, 7.7019f)
                curveTo(4.1251f, 7.2787f, 4.7048f, 7.025f, 5.7108f, 6.8898f)
                curveTo(6.7385f, 6.7516f, 8.0932f, 6.75f, 10.0f, 6.75f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 6.75f, 16.2615f, 6.7516f, 17.2892f, 6.8898f)
                curveTo(18.2952f, 7.025f, 18.8749f, 7.2787f, 19.2981f, 7.7019f)
                curveTo(19.7966f, 8.2004f, 20.0541f, 8.9085f, 20.1679f, 10.25f)
                horizontalLineTo(20.8333f)
                lineTo(20.8499f, 10.25f)
                close()
                moveTo(9.9436f, 5.25f)
                horizontalLineTo(13.0564f)
                curveTo(13.5729f, 5.25f, 14.0592f, 5.25f, 14.5168f, 5.2534f)
                lineTo(12.8501f, 4.1482f)
                curveTo(12.0493f, 3.6173f, 10.9507f, 3.6173f, 10.15f, 4.1482f)
                lineTo(8.4832f, 5.2534f)
                curveTo(8.9408f, 5.25f, 9.4271f, 5.25f, 9.9436f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.25f)
                curveTo(5.5858f, 9.25f, 5.25f, 9.5858f, 5.25f, 10.0f)
                curveTo(5.25f, 10.4142f, 5.5858f, 10.75f, 6.0f, 10.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 10.75f, 10.75f, 10.4142f, 10.75f, 10.0f)
                curveTo(10.75f, 9.5858f, 10.4142f, 9.25f, 10.0f, 9.25f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 14.0f)
                curveTo(19.0f, 14.5523f, 18.5523f, 15.0f, 18.0f, 15.0f)
                curveTo(17.4477f, 15.0f, 17.0f, 14.5523f, 17.0f, 14.0f)
                curveTo(17.0f, 13.4477f, 17.4477f, 13.0f, 18.0f, 13.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 13.4477f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _walletMoney!!
    }

private var _walletMoney: ImageVector? = null
