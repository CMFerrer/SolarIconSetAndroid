package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

public val MoneyGroup.TagHorizontal: ImageVector
    get() {
        if (_tagHorizontal != null) {
            return _tagHorizontal!!
        }
        _tagHorizontal = Builder(name = "TagHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.6628f, 3.25f)
                lineTo(13.3962f, 3.25f)
                curveTo(14.4775f, 3.25f, 15.3438f, 3.25f, 16.0539f, 3.3202f)
                curveTo(16.7893f, 3.393f, 17.4138f, 3.5451f, 18.0018f, 3.882f)
                curveTo(18.5885f, 4.2183f, 19.0412f, 4.6826f, 19.4875f, 5.2846f)
                curveTo(19.9201f, 5.868f, 20.3781f, 6.6257f, 20.9521f, 7.5754f)
                lineTo(21.6722f, 8.7667f)
                curveTo(22.1517f, 9.5599f, 22.5408f, 10.2035f, 22.8055f, 10.7633f)
                curveTo(23.0815f, 11.3467f, 23.25f, 11.8935f, 23.25f, 12.5f)
                curveTo(23.25f, 13.1065f, 23.0815f, 13.6533f, 22.8055f, 14.2367f)
                curveTo(22.5408f, 14.7965f, 22.1517f, 15.4401f, 21.6722f, 16.2333f)
                lineTo(20.9521f, 17.4246f)
                curveTo(20.3781f, 18.3743f, 19.9201f, 19.132f, 19.4875f, 19.7154f)
                curveTo(19.0412f, 20.3174f, 18.5885f, 20.7817f, 18.0018f, 21.118f)
                curveTo(17.4138f, 21.4549f, 16.7893f, 21.607f, 16.0539f, 21.6798f)
                curveTo(15.3438f, 21.75f, 14.4775f, 21.75f, 13.3962f, 21.75f)
                horizontalLineTo(10.6628f)
                curveTo(8.7745f, 21.75f, 7.2784f, 21.75f, 6.1074f, 21.5873f)
                curveTo(4.9002f, 21.4194f, 3.9283f, 21.0659f, 3.1648f, 20.2766f)
                curveTo(2.4048f, 19.4908f, 2.0675f, 18.4962f, 1.9067f, 17.2601f)
                curveTo(1.75f, 16.0544f, 1.75f, 14.5118f, 1.75f, 12.555f)
                verticalLineTo(12.445f)
                curveTo(1.75f, 10.4882f, 1.75f, 8.9456f, 1.9067f, 7.7399f)
                curveTo(2.0675f, 6.5038f, 2.4048f, 5.5092f, 3.1648f, 4.7234f)
                curveTo(3.9283f, 3.9341f, 4.9002f, 3.5805f, 6.1074f, 3.4127f)
                curveTo(7.2784f, 3.25f, 8.7745f, 3.25f, 10.6628f, 3.25f)
                close()
                moveTo(6.314f, 4.8985f)
                curveTo(5.2824f, 5.0419f, 4.6836f, 5.3107f, 4.2431f, 5.7662f)
                curveTo(3.7991f, 6.2252f, 3.5345f, 6.8547f, 3.3942f, 7.9333f)
                curveTo(3.2515f, 9.031f, 3.25f, 10.476f, 3.25f, 12.5f)
                curveTo(3.25f, 14.524f, 3.2515f, 15.969f, 3.3942f, 17.0667f)
                curveTo(3.5345f, 18.1453f, 3.7991f, 18.7748f, 4.2431f, 19.2338f)
                curveTo(4.6836f, 19.6893f, 5.2824f, 19.9582f, 6.314f, 20.1015f)
                curveTo(7.3697f, 20.2483f, 8.7614f, 20.25f, 10.721f, 20.25f)
                horizontalLineTo(13.358f)
                curveTo(14.4863f, 20.25f, 15.2785f, 20.2492f, 15.9062f, 20.187f)
                curveTo(16.517f, 20.1266f, 16.9142f, 20.0123f, 17.256f, 19.8165f)
                curveTo(17.599f, 19.6199f, 17.9062f, 19.3297f, 18.2826f, 18.822f)
                curveTo(18.668f, 18.3022f, 19.09f, 17.6055f, 19.6875f, 16.617f)
                lineTo(20.3683f, 15.4908f)
                curveTo(20.8728f, 14.6562f, 21.2214f, 14.0778f, 21.4495f, 13.5954f)
                curveTo(21.6702f, 13.1287f, 21.75f, 12.8077f, 21.75f, 12.5f)
                curveTo(21.75f, 12.1923f, 21.6702f, 11.8713f, 21.4495f, 11.4046f)
                curveTo(21.2214f, 10.9222f, 20.8728f, 10.3438f, 20.3683f, 9.5092f)
                lineTo(19.6875f, 8.383f)
                curveTo(19.09f, 7.3945f, 18.668f, 6.6978f, 18.2826f, 6.178f)
                curveTo(17.9062f, 5.6703f, 17.599f, 5.3801f, 17.256f, 5.1835f)
                curveTo(16.9142f, 4.9877f, 16.517f, 4.8734f, 15.9062f, 4.813f)
                curveTo(15.2785f, 4.7508f, 14.4863f, 4.75f, 13.358f, 4.75f)
                horizontalLineTo(10.721f)
                curveTo(8.7614f, 4.75f, 7.3697f, 4.7517f, 6.314f, 4.8985f)
                close()
                moveTo(7.5f, 7.2451f)
                curveTo(7.9142f, 7.2451f, 8.25f, 7.5809f, 8.25f, 7.9951f)
                verticalLineTo(17.0f)
                curveTo(8.25f, 17.4142f, 7.9142f, 17.75f, 7.5f, 17.75f)
                curveTo(7.0858f, 17.75f, 6.75f, 17.4142f, 6.75f, 17.0f)
                verticalLineTo(7.9951f)
                curveTo(6.75f, 7.5809f, 7.0858f, 7.2451f, 7.5f, 7.2451f)
                close()
            }
        }
        .build()
        return _tagHorizontal!!
    }

private var _tagHorizontal: ImageVector? = null
