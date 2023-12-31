package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(
            name = "Diploma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.9451f, 1.25f)
                horizontalLineTo(16.0549f)
                curveTo(17.4225f, 1.25f, 18.5248f, 1.25f, 19.3918f, 1.3665f)
                curveTo(20.2919f, 1.4875f, 21.0497f, 1.7464f, 21.6517f, 2.3484f)
                curveTo(22.2536f, 2.9503f, 22.5125f, 3.7081f, 22.6335f, 4.6083f)
                curveTo(22.75f, 5.4752f, 22.75f, 6.5775f, 22.75f, 7.9451f)
                verticalLineTo(12.0549f)
                curveTo(22.75f, 13.4225f, 22.75f, 14.5248f, 22.6335f, 15.3918f)
                curveTo(22.5125f, 16.2919f, 22.2536f, 17.0497f, 21.6517f, 17.6516f)
                curveTo(21.1537f, 18.1496f, 20.5469f, 18.4146f, 19.8361f, 18.5593f)
                curveTo(19.4739f, 18.6331f, 19.0724f, 18.6779f, 18.6302f, 18.7053f)
                curveTo(18.6324f, 18.7104f, 18.6347f, 18.7155f, 18.6369f, 18.7207f)
                curveTo(18.9098f, 19.361f, 18.6769f, 20.1059f, 18.057f, 20.4572f)
                curveTo(17.8707f, 20.5629f, 17.6702f, 20.6009f, 17.5301f, 20.6227f)
                curveTo(17.3836f, 20.6454f, 17.2006f, 20.6633f, 16.9974f, 20.6832f)
                lineTo(16.9776f, 20.6851f)
                curveTo(16.8468f, 20.6979f, 16.7726f, 20.7053f, 16.7175f, 20.7132f)
                curveTo(16.6924f, 20.7168f, 16.6791f, 20.7194f, 16.6739f, 20.7206f)
                curveTo(16.6583f, 20.7267f, 16.6477f, 20.7343f, 16.6409f, 20.7408f)
                curveTo(16.6358f, 20.7457f, 16.6321f, 20.7506f, 16.6294f, 20.7557f)
                curveTo(16.6282f, 20.7613f, 16.6265f, 20.7704f, 16.6244f, 20.7839f)
                curveTo(16.6166f, 20.8342f, 16.6091f, 20.903f, 16.5957f, 21.0292f)
                lineTo(16.5935f, 21.0498f)
                curveTo(16.5729f, 21.2432f, 16.554f, 21.421f, 16.5298f, 21.5641f)
                curveTo(16.5066f, 21.702f, 16.4648f, 21.9054f, 16.3486f, 22.0938f)
                curveTo(15.9743f, 22.7006f, 15.2273f, 22.8883f, 14.6126f, 22.6475f)
                curveTo(14.4208f, 22.5723f, 14.2668f, 22.4498f, 14.1557f, 22.3543f)
                curveTo(14.0419f, 22.2565f, 13.9078f, 22.1279f, 13.7577f, 21.984f)
                lineTo(12.0f, 20.2989f)
                lineTo(10.2424f, 21.984f)
                curveTo(10.0922f, 22.1279f, 9.9581f, 22.2565f, 9.8443f, 22.3543f)
                curveTo(9.7332f, 22.4498f, 9.5793f, 22.5723f, 9.3874f, 22.6475f)
                curveTo(8.7727f, 22.8883f, 8.0257f, 22.7006f, 7.6514f, 22.0938f)
                curveTo(7.5352f, 21.9054f, 7.4935f, 21.702f, 7.4702f, 21.5641f)
                curveTo(7.4461f, 21.421f, 7.4271f, 21.2431f, 7.4065f, 21.0497f)
                lineTo(7.4043f, 21.0292f)
                curveTo(7.3909f, 20.903f, 7.3834f, 20.8342f, 7.3755f, 20.7839f)
                curveTo(7.3735f, 20.7704f, 7.3718f, 20.7613f, 7.3706f, 20.7557f)
                curveTo(7.3679f, 20.7506f, 7.3642f, 20.7457f, 7.3591f, 20.7408f)
                curveTo(7.3523f, 20.7343f, 7.3417f, 20.7267f, 7.3261f, 20.7206f)
                curveTo(7.3209f, 20.7194f, 7.3076f, 20.7168f, 7.2825f, 20.7132f)
                curveTo(7.2274f, 20.7053f, 7.1532f, 20.6979f, 7.0224f, 20.6851f)
                lineTo(7.0026f, 20.6832f)
                curveTo(6.7994f, 20.6633f, 6.6164f, 20.6454f, 6.4699f, 20.6227f)
                curveTo(6.3298f, 20.6009f, 6.1294f, 20.5629f, 5.943f, 20.4572f)
                curveTo(5.3231f, 20.1059f, 5.0902f, 19.361f, 5.3631f, 18.7207f)
                curveTo(5.3653f, 18.7155f, 5.3676f, 18.7104f, 5.3699f, 18.7052f)
                curveTo(4.9712f, 18.6805f, 4.6071f, 18.6418f, 4.2764f, 18.5811f)
                curveTo(3.5184f, 18.4418f, 2.8733f, 18.1766f, 2.3484f, 17.6517f)
                curveTo(1.7464f, 17.0497f, 1.4875f, 16.2919f, 1.3665f, 15.3918f)
                curveTo(1.25f, 14.5248f, 1.25f, 13.4225f, 1.25f, 12.0549f)
                verticalLineTo(7.9451f)
                curveTo(1.25f, 6.5775f, 1.25f, 5.4752f, 1.3665f, 4.6083f)
                curveTo(1.4875f, 3.7081f, 1.7464f, 2.9503f, 2.3484f, 2.3484f)
                curveTo(2.9503f, 1.7464f, 3.7081f, 1.4875f, 4.6083f, 1.3665f)
                curveTo(5.4752f, 1.25f, 6.5775f, 1.25f, 7.9451f, 1.25f)
                close()
                moveTo(6.7329f, 17.2462f)
                lineTo(7.5487f, 16.4641f)
                lineTo(8.2579f, 15.7549f)
                curveTo(8.3841f, 13.7981f, 10.0113f, 12.25f, 12.0f, 12.25f)
                curveTo(13.9887f, 12.25f, 15.6159f, 13.7981f, 15.7421f, 15.7549f)
                lineTo(16.4513f, 16.4641f)
                lineTo(17.3122f, 17.2894f)
                lineTo(17.3117f, 17.2458f)
                curveTo(18.2984f, 17.2353f, 19.0017f, 17.1984f, 19.5368f, 17.0895f)
                curveTo(20.0513f, 16.9847f, 20.359f, 16.8229f, 20.591f, 16.591f)
                curveTo(20.8678f, 16.3142f, 21.0482f, 15.9257f, 21.1469f, 15.1919f)
                curveTo(21.2484f, 14.4365f, 21.25f, 13.4354f, 21.25f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(21.25f, 6.5646f, 21.2484f, 5.5635f, 21.1469f, 4.8081f)
                curveTo(21.0482f, 4.0743f, 20.8678f, 3.6858f, 20.591f, 3.409f)
                curveTo(20.3142f, 3.1323f, 19.9257f, 2.9518f, 19.1919f, 2.8531f)
                curveTo(18.4365f, 2.7516f, 17.4354f, 2.75f, 16.0f, 2.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 2.75f, 5.5635f, 2.7516f, 4.8081f, 2.8531f)
                curveTo(4.0743f, 2.9518f, 3.6858f, 3.1323f, 3.409f, 3.409f)
                curveTo(3.1323f, 3.6858f, 2.9518f, 4.0743f, 2.8531f, 4.8081f)
                curveTo(2.7516f, 5.5635f, 2.75f, 6.5646f, 2.75f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(2.75f, 13.4354f, 2.7516f, 14.4365f, 2.8531f, 15.1919f)
                curveTo(2.9518f, 15.9257f, 3.1323f, 16.3142f, 3.409f, 16.591f)
                curveTo(3.6525f, 16.8344f, 3.9805f, 17.0016f, 4.5473f, 17.1057f)
                curveTo(5.0857f, 17.2046f, 5.7806f, 17.2368f, 6.7329f, 17.2462f)
                close()
                moveTo(15.4159f, 17.5495f)
                curveTo(15.0094f, 18.4444f, 14.2614f, 19.1513f, 13.3384f, 19.5041f)
                lineTo(14.7819f, 20.888f)
                curveTo(14.9099f, 21.0107f, 15.0009f, 21.0977f, 15.0719f, 21.1622f)
                curveTo(15.081f, 21.0864f, 15.0912f, 20.9919f, 15.1041f, 20.8702f)
                curveTo(15.1059f, 20.8537f, 15.1076f, 20.8368f, 15.1094f, 20.8197f)
                curveTo(15.1285f, 20.636f, 15.1511f, 20.4185f, 15.2269f, 20.2221f)
                curveTo(15.3949f, 19.7871f, 15.7449f, 19.4585f, 16.1765f, 19.3054f)
                curveTo(16.3708f, 19.2364f, 16.5859f, 19.2158f, 16.7795f, 19.1973f)
                curveTo(16.7969f, 19.1956f, 16.8143f, 19.1939f, 16.8314f, 19.1922f)
                curveTo(16.9388f, 19.1817f, 17.0267f, 19.1731f, 17.1f, 19.1652f)
                curveTo(17.043f, 19.1094f, 16.973f, 19.0423f, 16.8857f, 18.9586f)
                lineTo(15.4159f, 17.5495f)
                close()
                moveTo(12.0301f, 18.2498f)
                lineTo(12.0f, 18.2209f)
                lineTo(11.9699f, 18.2498f)
                curveTo(10.7411f, 18.2337f, 9.75f, 17.2326f, 9.75f, 16.0f)
                curveTo(9.75f, 14.7574f, 10.7574f, 13.75f, 12.0f, 13.75f)
                curveTo(13.2426f, 13.75f, 14.25f, 14.7574f, 14.25f, 16.0f)
                curveTo(14.25f, 17.2326f, 13.2589f, 18.2337f, 12.0301f, 18.2498f)
                close()
                moveTo(10.6616f, 19.5041f)
                lineTo(9.2181f, 20.888f)
                curveTo(9.0901f, 21.0107f, 8.9991f, 21.0977f, 8.9281f, 21.1622f)
                curveTo(8.919f, 21.0864f, 8.9088f, 20.9919f, 8.8959f, 20.8702f)
                curveTo(8.8941f, 20.8537f, 8.8924f, 20.8368f, 8.8906f, 20.8197f)
                curveTo(8.8715f, 20.636f, 8.849f, 20.4185f, 8.7731f, 20.2221f)
                curveTo(8.6051f, 19.7871f, 8.2551f, 19.4585f, 7.8235f, 19.3054f)
                curveTo(7.6292f, 19.2364f, 7.4141f, 19.2158f, 7.2205f, 19.1973f)
                curveTo(7.203f, 19.1956f, 7.1857f, 19.1939f, 7.1686f, 19.1922f)
                curveTo(7.0612f, 19.1817f, 6.9733f, 19.1731f, 6.9001f, 19.1652f)
                curveTo(6.957f, 19.1094f, 7.0269f, 19.0423f, 7.1143f, 18.9586f)
                lineTo(8.5841f, 17.5495f)
                curveTo(8.9907f, 18.4444f, 9.7386f, 19.1513f, 10.6616f, 19.5041f)
                close()
                moveTo(8.25f, 6.0f)
                curveTo(8.25f, 5.5858f, 8.5858f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.25f, 15.75f, 5.5858f, 15.75f, 6.0f)
                curveTo(15.75f, 6.4142f, 15.4142f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 6.75f, 8.25f, 6.4142f, 8.25f, 6.0f)
                close()
                moveTo(6.25f, 9.5f)
                curveTo(6.25f, 9.0858f, 6.5858f, 8.75f, 7.0f, 8.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 8.75f, 17.75f, 9.0858f, 17.75f, 9.5f)
                curveTo(17.75f, 9.9142f, 17.4142f, 10.25f, 17.0f, 10.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 10.25f, 6.25f, 9.9142f, 6.25f, 9.5f)
                close()
            }
        }
            .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
