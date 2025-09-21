package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(
            name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.5277f, 10.3733f)
                curveTo(20.157f, 9.7314f, 19.4777f, 9.5204f, 18.8292f, 9.4297f)
                curveTo(18.1755f, 9.3383f, 17.3006f, 9.3383f, 16.2424f, 9.3383f)
                lineTo(16.1822f, 9.3383f)
                curveTo(15.5521f, 9.3383f, 15.1402f, 9.3321f, 14.84f, 9.2904f)
                curveTo(14.5686f, 9.2527f, 14.4823f, 9.1968f, 14.4455f, 9.1642f)
                curveTo(14.4185f, 9.1361f, 14.3704f, 9.0704f, 14.3377f, 8.8334f)
                curveTo(14.2991f, 8.554f, 14.2974f, 8.1709f, 14.2974f, 7.5568f)
                verticalLineTo(7.1823f)
                curveTo(14.2975f, 5.5948f, 14.2975f, 4.323f, 14.1753f, 3.4164f)
                curveTo(14.0606f, 2.5653f, 13.788f, 1.6094f, 12.8438f, 1.3201f)
                curveTo(11.9162f, 1.0358f, 11.1382f, 1.6454f, 10.5335f, 2.2738f)
                curveTo(9.8892f, 2.9432f, 9.124f, 3.9787f, 8.1658f, 5.2751f)
                lineTo(5.0288f, 9.5195f)
                curveTo(4.4184f, 10.3452f, 3.9097f, 11.0335f, 3.6065f, 11.6027f)
                curveTo(3.3026f, 12.1733f, 3.0815f, 12.8507f, 3.4185f, 13.5265f)
                lineTo(3.4197f, 13.529f)
                lineTo(3.4233f, 13.5363f)
                lineTo(3.4273f, 13.5443f)
                lineTo(3.4313f, 13.5519f)
                lineTo(3.4356f, 13.5601f)
                lineTo(3.44f, 13.5682f)
                lineTo(3.4442f, 13.5758f)
                lineTo(3.4487f, 13.5835f)
                lineTo(3.4527f, 13.5904f)
                lineTo(3.4542f, 13.5929f)
                curveTo(3.8217f, 14.2294f, 4.4981f, 14.4522f, 5.1524f, 14.5521f)
                curveTo(5.8267f, 14.655f, 6.7265f, 14.6616f, 7.8178f, 14.6616f)
                curveTo(8.4544f, 14.6616f, 8.8603f, 14.6631f, 9.1584f, 14.7011f)
                curveTo(9.4218f, 14.7347f, 9.5005f, 14.7864f, 9.5343f, 14.8163f)
                curveTo(9.5642f, 14.8475f, 9.6166f, 14.9205f, 9.6536f, 15.166f)
                curveTo(9.6959f, 15.4471f, 9.7026f, 15.8361f, 9.7026f, 16.4432f)
                lineTo(9.7026f, 16.8175f)
                curveTo(9.7025f, 18.4051f, 9.7025f, 19.6769f, 9.8246f, 20.5836f)
                curveTo(9.9393f, 21.4346f, 10.2119f, 22.3905f, 11.1561f, 22.6798f)
                curveTo(12.0837f, 22.9641f, 12.8617f, 22.3546f, 13.4665f, 21.7261f)
                curveTo(14.1107f, 21.0567f, 14.876f, 20.0212f, 15.8342f, 18.7248f)
                lineTo(18.9336f, 14.5314f)
                curveTo(19.5644f, 13.678f, 20.0832f, 12.965f, 20.3891f, 12.3716f)
                curveTo(20.6885f, 11.7908f, 20.8974f, 11.1094f, 20.5634f, 10.4398f)
                lineTo(20.5623f, 10.4374f)
                lineTo(20.5587f, 10.4301f)
                lineTo(20.5546f, 10.4221f)
                lineTo(20.5507f, 10.4144f)
                lineTo(20.5463f, 10.4062f)
                lineTo(20.5418f, 10.398f)
                lineTo(20.5376f, 10.3904f)
                lineTo(20.5332f, 10.3827f)
                lineTo(20.5291f, 10.3757f)
                lineTo(20.5277f, 10.3733f)
                close()
                moveTo(11.6143f, 3.3139f)
                curveTo(11.0463f, 3.9041f, 10.3386f, 4.859f, 9.3348f, 6.2171f)
                lineTo(6.2727f, 10.3601f)
                curveTo(5.615f, 11.25f, 5.175f, 11.8487f, 4.9304f, 12.3078f)
                curveTo(4.8114f, 12.5313f, 4.7667f, 12.6722f, 4.754f, 12.7576f)
                curveTo(4.7462f, 12.8103f, 4.751f, 12.8341f, 4.7572f, 12.8493f)
                curveTo(4.7814f, 12.885f, 4.8864f, 12.9941f, 5.3788f, 13.0693f)
                curveTo(5.9167f, 13.1514f, 6.6901f, 13.1616f, 7.8178f, 13.1616f)
                lineTo(7.8637f, 13.1616f)
                curveTo(8.4409f, 13.1616f, 8.9437f, 13.1616f, 9.3481f, 13.2131f)
                curveTo(9.7813f, 13.2684f, 10.2116f, 13.3939f, 10.5679f, 13.729f)
                lineTo(10.5737f, 13.7345f)
                lineTo(10.5794f, 13.7401f)
                curveTo(10.9294f, 14.0837f, 11.0717f, 14.5097f, 11.1369f, 14.9427f)
                curveTo(11.1992f, 15.3565f, 11.2026f, 15.8656f, 11.2026f, 16.4432f)
                lineTo(11.2026f, 16.7528f)
                curveTo(11.2025f, 18.4197f, 11.2042f, 19.5892f, 11.3112f, 20.3833f)
                curveTo(11.3645f, 20.7787f, 11.4362f, 21.0106f, 11.5048f, 21.1401f)
                curveTo(11.5562f, 21.2372f, 11.5858f, 21.2435f, 11.5941f, 21.2453f)
                lineTo(11.5956f, 21.2457f)
                lineTo(11.5971f, 21.2462f)
                curveTo(11.6076f, 21.2498f, 11.6445f, 21.2625f, 11.7581f, 21.2053f)
                curveTo(11.9001f, 21.1339f, 12.103f, 20.9798f, 12.3857f, 20.686f)
                curveTo(12.9536f, 20.0958f, 13.6614f, 19.1409f, 14.6652f, 17.7828f)
                lineTo(17.7273f, 13.6399f)
                curveTo(18.3813f, 12.7551f, 18.817f, 12.1476f, 19.0559f, 11.6842f)
                curveTo(19.2606f, 11.2871f, 19.2383f, 11.1526f, 19.2247f, 11.1169f)
                curveTo(19.2022f, 11.0841f, 19.1014f, 10.9823f, 18.6215f, 10.9152f)
                curveTo(18.0844f, 10.8401f, 17.3159f, 10.8383f, 16.1822f, 10.8383f)
                curveTo(15.5794f, 10.8383f, 15.0565f, 10.8349f, 14.6335f, 10.7761f)
                curveTo(14.1966f, 10.7154f, 13.7653f, 10.5839f, 13.4122f, 10.2517f)
                lineTo(13.4063f, 10.2462f)
                lineTo(13.4006f, 10.2406f)
                curveTo(13.0474f, 9.8939f, 12.9112f, 9.4685f, 12.8518f, 9.0386f)
                curveTo(12.7974f, 8.6443f, 12.7974f, 8.156f, 12.7974f, 7.6051f)
                lineTo(12.7974f, 7.2471f)
                curveTo(12.7974f, 5.5802f, 12.7957f, 4.4107f, 12.6887f, 3.6167f)
                curveTo(12.6355f, 3.2213f, 12.5638f, 2.9894f, 12.4952f, 2.8598f)
                curveTo(12.4437f, 2.7628f, 12.4141f, 2.7564f, 12.4058f, 2.7546f)
                lineTo(12.4043f, 2.7543f)
                lineTo(12.4028f, 2.7538f)
                curveTo(12.3924f, 2.7501f, 12.3555f, 2.7374f, 12.2418f, 2.7946f)
                curveTo(12.0998f, 2.8661f, 11.897f, 3.0202f, 11.6143f, 3.3139f)
                close()
            }
        }
            .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
